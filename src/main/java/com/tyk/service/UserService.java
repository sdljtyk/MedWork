package com.tyk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.UserMapper;
import com.tyk.pojo.User;
import com.tyk.pojo.UserExample;
import com.tyk.util.MD5;
import com.tyk.vo.ActiveUser;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	public ActiveUser FindActiveByNumAndPass(String usernumber, String userpass) {
		ActiveUser activeUser = new ActiveUser();
		UserExample userExample = new UserExample();
		userExample.createCriteria()
		.andUsernumberEqualTo(usernumber)
		.andUserpassEqualTo(new MD5().getMD5ofStr(userpass));
		List<User> users = userMapper.selectByExample(userExample);
		if(users.isEmpty())
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
	
}
