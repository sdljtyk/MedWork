package com.tyk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.DicinfoMapper;
import com.tyk.mapper.XzqyMapper;
import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.DicinfoExample;
import com.tyk.pojo.Xzqy;
import com.tyk.pojo.XzqyExample;

@Service
public class BaseService {

	@Autowired
	private DicinfoMapper dicinfoMapper;
	@Autowired
	private XzqyMapper mapper;
	
	public List<Dicinfo> FindDicByType(String string) {
		DicinfoExample dicinfoExample = new DicinfoExample();
		dicinfoExample.createCriteria().andDictypeEqualTo(string);
		List<Dicinfo> list = dicinfoMapper.selectByExample(dicinfoExample);
		return list;
	}

	public List<Xzqy> FinAllDq() {
		XzqyExample example = new XzqyExample();
		return mapper.selectByExample(example);
	}

}
