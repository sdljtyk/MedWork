package com.tyk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.DicinfoMapper;
import com.tyk.mapper.XzqyMapper;
import com.tyk.mapper.YyunitMapper;
import com.tyk.pojo.Yyunit;
import com.tyk.pojo.YyunitExample;
import com.tyk.pojo.YyunitExample.Criteria;
import com.tyk.vo.YYCustom;


@Service
public class YYUnitService {
	
	@Autowired 
	private YyunitMapper yyunitMapper;
	@Autowired
	private XzqyMapper dpMapper;
	@Autowired
	private DicinfoMapper dicinfoMapper;
	
	public YYCustom FindCusByUnit(Yyunit yyunit)
	{
		YYCustom custom = new YYCustom();
		String jbmc = dicinfoMapper.selectByPrimaryKey(Integer.parseInt(yyunit.getYyjb())).getInfo();
		String dqmc = dpMapper.selectByPrimaryKey(yyunit.getYydqid()).getName();
		custom.setDqmc(dqmc);
		custom.setId(yyunit.getId());
		custom.setJbmc(jbmc);
		custom.setYyaddr(yyunit.getYyaddr());
		custom.setYycws(yyunit.getYycws());
		custom.setYydqid(yyunit.getYydqid());
		custom.setYyjb(yyunit.getYyjb());
		custom.setYylxr(yyunit.getYylxr());
		custom.setYyname(yyunit.getYyname());
		custom.setYyphone(yyunit.getYyphone());
		custom.setYycz(yyunit.getYycz());
		return custom;
	}
	
	public List<YYCustom> FindListByYyCustom(YYCustom yyCustom) {
		List<YYCustom> list = new ArrayList<YYCustom>();
		YyunitExample example = new YyunitExample();
		if(yyCustom!=null)
		{
			Criteria criteria = example.createCriteria();
			criteria.andYynameLike("%" + (yyCustom.getYyname()==null ? "" : yyCustom.getYyname()) + "%");
			if(yyCustom.getYyjb() != null && !yyCustom.getYyjb().equals("0") ) {
				criteria.andYyjbEqualTo(yyCustom.getYyjb());
			}
			if(yyCustom.getYydqid() != null && yyCustom.getYydqid() != 0 ) {
				criteria.andYydqidEqualTo(yyCustom.getYydqid());
			}
		}
		List<Yyunit> temp = yyunitMapper.selectByExample(example);
		
		for (Yyunit yyunit : temp) {
			YYCustom custom = FindCusByUnit(yyunit);
			list.add(custom);
		}
		return list;
	}

	public int FindCountByYyCustom(YYCustom yyCustom) {
		int count = FindListByYyCustom(yyCustom).size();
		return count;
	}

	public YYCustom FindCusById(String editid) {
		Yyunit unit = yyunitMapper.selectByPrimaryKey(Integer.parseInt(editid));
		YYCustom custom = FindCusByUnit(unit);
		return custom;
	}

	public int InsertYy(Yyunit unit) {
		return yyunitMapper.insertSelective(unit);
	}

	public int UpdateYy(Yyunit unit) {
		return yyunitMapper.updateByPrimaryKeySelective(unit);
	}

	public int DelYyByID(String delid) {
		return yyunitMapper.deleteByPrimaryKey(Integer.parseInt(delid));
	}

}
