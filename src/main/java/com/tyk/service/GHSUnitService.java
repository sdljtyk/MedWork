package com.tyk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.GhqyMapper;
import com.tyk.mapper.GhsunitMapper;
import com.tyk.mapper.XzqyMapper;
import com.tyk.pojo.Ghqy;
import com.tyk.pojo.GhqyExample;
import com.tyk.pojo.Ghsunit;
import com.tyk.pojo.GhsunitExample;
import com.tyk.pojo.Xzqy;
import com.tyk.vo.GHSCustom;

@Service
public class GHSUnitService {

	@Autowired
	private GhsunitMapper ghsunitMapper;
	@Autowired
	private GhqyMapper ghqyMapper;
	@Autowired
	private XzqyMapper xzqyMapper;
	
	public GHSCustom FindCusByUnit(Ghsunit unit)
	{
		GHSCustom custom = new GHSCustom();
		GhqyExample example = new GhqyExample();
		example.createCriteria().andGysunitidEqualTo(unit.getId());
		List<Ghqy> ghqy= ghqyMapper.selectByExample(example);
		List<Xzqy> dqs = new ArrayList<Xzqy>();
		String dqmc = "";
		for (Ghqy ghqy2 : ghqy) {
			Xzqy x = xzqyMapper.selectByPrimaryKey(ghqy2.getXzqyid());
			dqmc=dqmc+","+x.getName();
			dqs.add(x);
		}
		custom.setId(unit.getId());
		custom.setDqs(dqs);
		custom.setDqmc(dqmc);
		custom.setGhsaddr(unit.getGhsaddr());
		custom.setGhsfr(unit.getGhsfr());
		custom.setGhshome(unit.getGhshome());
		custom.setGhsjj(unit.getGhsjj());
		custom.setGhsjyfw(unit.getGhsjyfw());
		custom.setGhslb(unit.getGhslb());;
		custom.setGhslxr(unit.getGhslxr());
		custom.setGhsname(unit.getGhsname());
		custom.setGhsother(unit.getGhsother());
		custom.setGhsphone(unit.getGhsphone());
		custom.setGhsxkz(unit.getGhsxkz());
		custom.setGhszczj(unit.getGhszczj());
		custom.setGhszzc(unit.getGhszzc());
		return custom;
	}
	
	public List<GHSCustom> FindListByGhsCustom(GHSCustom ghsCustom) {
		List<GHSCustom> list = new ArrayList<GHSCustom>();
		GhsunitExample example = new GhsunitExample();
		if(ghsCustom.getGhsname()!=null)
		{
			example.createCriteria().andGhsnameLike("%"+ghsCustom.getGhsname()+"%");
		}
		List<Ghsunit> temp = ghsunitMapper.selectByExample(example);
		for (Ghsunit ghsunit : temp) {
			GHSCustom custom = FindCusByUnit(ghsunit);
			list.add(custom);
		}
		return list;
	}

	public int FindCountByGhsCustom(GHSCustom ghsCustom) {
		int count = FindListByGhsCustom(ghsCustom).size();
		return count;
	}

	public GHSCustom FindCusByUnit(String editid) {
		Ghsunit unit = ghsunitMapper.selectByPrimaryKey(Integer.parseInt(editid));
		GHSCustom custom = FindCusByUnit(unit);
		return custom;
	}

	public int UpdateGhs(Ghsunit unit, String[] dqid) {
		int index = ghsunitMapper.updateByPrimaryKeySelective(unit);
		int i;
		GhqyExample example = new GhqyExample();
		example.createCriteria().andGysunitidEqualTo(unit.getId());
		List<Ghqy> ghqy= ghqyMapper.selectByExample(example);
		for (Ghqy ghqy2 : ghqy) {
			ghqyMapper.deleteByPrimaryKey(ghqy2.getId());
		}
		for(i=0;i<dqid.length;i++) {
			Ghqy temp = new Ghqy();
			temp.setGysunitid(unit.getId());
			temp.setXzqyid(Integer.parseInt(dqid[i]));
			ghqyMapper.insertSelective(temp);
		}
		return index;
	}

	public int InsertGhs(Ghsunit unit, String[] dqid) {
		int i = ghsunitMapper.insertSelective(unit);
		for(i=0;i<dqid.length;i++) {
			Ghqy temp = new Ghqy();
			temp.setGysunitid(unit.getId());
			temp.setXzqyid(Integer.parseInt(dqid[i]));
			ghqyMapper.insertSelective(temp);
		}
		return 0;
	}

	public int DelGhsByID(String delid) {
		int index = ghsunitMapper.deleteByPrimaryKey(Integer.parseInt(delid));
		GhqyExample example = new GhqyExample();
		example.createCriteria().andGysunitidEqualTo(Integer.parseInt(delid));
		List<Ghqy> ghqy= ghqyMapper.selectByExample(example);
		for (Ghqy ghqy2 : ghqy) {
			ghqyMapper.deleteByPrimaryKey(ghqy2.getId());
		}
		return index;
	}

}
