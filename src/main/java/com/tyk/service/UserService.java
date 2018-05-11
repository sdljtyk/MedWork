package com.tyk.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.DicinfoMapper;
import com.tyk.mapper.GhsunitMapper;
import com.tyk.mapper.UserMapper;
import com.tyk.mapper.YyunitMapper;
import com.tyk.pojo.Ghsunit;
import com.tyk.pojo.GhsunitExample;
import com.tyk.pojo.User;
import com.tyk.pojo.UserExample;
import com.tyk.pojo.UserExample.Criteria;
import com.tyk.pojo.Yyunit;
import com.tyk.pojo.YyunitExample;
import com.tyk.util.MD5;
import com.tyk.vo.ActiveUser;
import com.tyk.vo.UserCustom;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private DicinfoMapper dicinfoMapper;
	@Autowired
	private GhsunitMapper ghsunitMapper;
	@Autowired
	private YyunitMapper yyunitMapper;

	public ActiveUser FindActiveByNumAndPass(String usernumber, String userpass) {
		ActiveUser activeUser = new ActiveUser();
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernumberEqualTo(usernumber)
				.andUserpassEqualTo(new MD5().getMD5ofStr(userpass));
		List<User> users = userMapper.selectByExample(userExample);
		if (users.isEmpty())
			return null;
		else {
			User user = users.get(0);
			activeUser.setUserid(user.getId().toString());
			activeUser.setUnitID(user.getUnitid().toString());
			activeUser.setGroupid(user.getGroupid().toString());
			activeUser.setUsername(user.getUsername());
			activeUser.setUnitName(null);
			activeUser.setGroupname(null);
			activeUser.setMenu(null);
			return activeUser;

		}
	}

	public UserCustom FindCusByUser(User user) {
		UserCustom userCustom = new UserCustom();
		int groupid = user.getGroupid();
		String groupName = dicinfoMapper.selectByPrimaryKey(groupid).getInfo();
		String unitName = "";
		if (groupid == 26)
			unitName = "监督部门";
		else if (groupid == 27)
			unitName = yyunitMapper.selectByPrimaryKey(user.getUnitid()).getYyname();
		else
			unitName = ghsunitMapper.selectByPrimaryKey(user.getUnitid()).getGhsname();

		userCustom.setGroupid(groupid);
		userCustom.setGroupName(groupName);
		userCustom.setId(user.getId());
		userCustom.setOthers(user.getOthers());
		userCustom.setUnitid(user.getUnitid());
		userCustom.setUnitName(unitName);
		userCustom.setUseraddr(user.getUseraddr());
		userCustom.setUseralter(user.getUseralter());
		userCustom.setUsercreate(user.getUsercreate());
		userCustom.setUseremail(user.getUseremail());
		userCustom.setUsername(user.getUsername());
		userCustom.setUsernumber(user.getUsernumber());
		userCustom.setUserpass(user.getUserpass());
		userCustom.setUserphone(user.getUserphone());
		userCustom.setUsersex(user.getUsersex());
		userCustom.setUserstate(user.getUserstate());

		return userCustom;
	}

	public int updatePwd(String oldpwd, String newpwd, String userid) {
		User user = userMapper.selectByPrimaryKey(Integer.parseInt(userid));
		String oldPwd = new MD5().getMD5ofStr(oldpwd);
		String newPwd = new MD5().getMD5ofStr(newpwd);
		if (!oldPwd.equals(user.getUserpass()))
			return 0;
		else {
			user.setUserpass(newPwd);
			int result = userMapper.updateByPrimaryKey(user);
			if (result == 1)
				return 1;
			else
				return 2;
		}
	}

	public List<UserCustom> FindListByUserCustom(UserCustom userCustom) {
		List<UserCustom> list = new ArrayList<UserCustom>();
		UserExample example = new UserExample();
		if(userCustom != null)
		{
			Criteria criteria = example.createCriteria();
			criteria.andUsernumberLike(
					"%" + (userCustom.getUsernumber() == null ? "" : userCustom.getUsernumber()) + "%")
					.andUsernameLike("%" + (userCustom.getUsername() == null ? "" : userCustom.getUsername()) + "%");
			if (userCustom.getGroupid() != null && userCustom.getGroupid() != 0)
				criteria.andGroupidEqualTo(userCustom.getGroupid());
		}
		List<User> users = userMapper.selectByExample(example);
		
		for (User user : users) {
			UserCustom temp = FindCusByUser(user);
			list.add(temp);
		}
		return list;
	}

	public int FindCountByUserCustom(UserCustom userCustom) {

		int count = FindListByUserCustom(userCustom).size();
		return count;
	}

	public UserCustom FinCusByID(String editid) {
		
		User user = userMapper.selectByPrimaryKey(Integer.parseInt(editid));
		
		return FindCusByUser(user);
	}

	public int InsertUser(User user) {
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		MD5 md5 = new MD5();
		user.setUsercreate(df.format(day));
		user.setUseralter(df.format(day));
		user.setUserpass(md5.getMD5ofStr(user.getUserpass()));
		int j = userMapper.insertSelective(user);
		return j;
	}

	public int UpdateUser(User user) {
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		MD5 md5 = new MD5();
		user.setUserpass(md5.getMD5ofStr(user.getUserpass()));
		user.setUseralter(df.format(day));
		int j = userMapper.updateByPrimaryKeySelective(user);
		return j;
	}

	public List<Map<String, String>> FinMapByGroupID(String groupid) {
		List<Map<String, String>> list = new ArrayList<>();
		
		if(groupid.equals("26")) {			
			Map<String,String> map = new HashMap<String, String>();
			map.put("id", "0");
			map.put("text", "监管部门");
			list.add(map);
		}
		
		YyunitExample example = new YyunitExample();
		GhsunitExample example2 = new GhsunitExample();
		
		if(groupid.equals("27"))
		{
			List<Yyunit> unit = yyunitMapper.selectByExample(example);
			for (Yyunit yyunit : unit) {
				Map<String,String> map = new HashMap<String, String>();
				map.put("id", yyunit.getId().toString());
				map.put("text", yyunit.getYyname());
				list.add(map);
			}
		}
		if(groupid.equals("28"))
		{
			List<Ghsunit> ghsunit = ghsunitMapper.selectByExample(example2);
			for (Ghsunit ghs : ghsunit) {
				Map<String,String> map = new HashMap<String, String>();
				map.put("id", ghs.getId().toString());
				map.put("text", ghs.getGhsname());
				list.add(map);
			}
		}
		return list;
	}

	public int DelUserByID(String delid) {
		int i = userMapper.deleteByPrimaryKey(Integer.parseInt(delid));
		return i;
	}

}
