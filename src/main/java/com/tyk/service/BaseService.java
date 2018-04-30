package com.tyk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.DicinfoMapper;
import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.DicinfoExample;

@Service
public class BaseService {

	@Autowired

	private DicinfoMapper dicinfoMapper;
	
	public List<Dicinfo> FindDicByType(String string) {
		DicinfoExample dicinfoExample = new DicinfoExample();
		dicinfoExample.createCriteria().andDictypeEqualTo(string);
		List<Dicinfo> list = dicinfoMapper.selectByExample(dicinfoExample);
		return list;
	}

}
