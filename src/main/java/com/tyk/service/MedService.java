package com.tyk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.DicinfoMapper;
import com.tyk.mapper.MedinfoMapper;
import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.Medinfo;
import com.tyk.pojo.MedinfoExample;
import com.tyk.pojo.MedinfoExample.Criteria;
import com.tyk.vo.YpxxCustom;

@Service
public class MedService {

	@Autowired
	private MedinfoMapper medinfoMapper;
	@Autowired
	private DicinfoMapper dicinfoMapper;

	public YpxxCustom FindCusByMed(Medinfo medinfo) {
		YpxxCustom temp = new YpxxCustom();
		String lbmc = dicinfoMapper.selectByPrimaryKey(medinfo.getMedclass()).getInfo();
		String zlccmc = dicinfoMapper.selectByPrimaryKey(Integer.parseInt(medinfo.getMedzl())).getInfo();
		String jyztmc = dicinfoMapper.selectByPrimaryKey(medinfo.getMedstate()).getInfo();
		temp.setId(medinfo.getId());
		temp.setMedabout(medinfo.getMedabout());
		temp.setMedclass(medinfo.getMedclass());
		temp.setMeddw(medinfo.getMeddw());
		temp.setMedgg(medinfo.getMedgg());
		temp.setMedjk(medinfo.getMedjk());
		temp.setMedjx(medinfo.getMedjx());
		temp.setMedmake(medinfo.getMedmake());
		temp.setMedname(medinfo.getMedname());
		temp.setMednumber(medinfo.getMednumber());
		temp.setMedpz(medinfo.getMedpz());
		temp.setMedstate(medinfo.getMedstate());
		temp.setMedzl(medinfo.getMedzl());
		temp.setLbmc(lbmc);
		temp.setZlccmc(zlccmc);
		temp.setJyztmc(jyztmc);
		return temp;
	}

	public List<YpxxCustom> FindListByCustom(YpxxCustom ypxxCustom) {
		List<YpxxCustom> list = new ArrayList<YpxxCustom>();
		List<Medinfo> medinfos = new ArrayList<Medinfo>();
		MedinfoExample example = new MedinfoExample();
		if (ypxxCustom != null) {
			Criteria criteria = example.createCriteria();
			criteria.andMednumberLike("%" + (ypxxCustom.getMednumber()==null ? "" : ypxxCustom.getMednumber()) + "%")
					.andMednameLike("%" + (ypxxCustom.getMedname()==null ? "" : ypxxCustom.getMedname()) + "%")
					.andMedjxLike("%" + (ypxxCustom.getMedjx()==null ? "" : ypxxCustom.getMedjx()) + "%")
					.andMedggLike("%" + (ypxxCustom.getMedgg()==null ? "" : ypxxCustom.getMedgg()) + "%")
					.andMeddwLike("%" + (ypxxCustom.getMeddw()==null ? "" : ypxxCustom.getMeddw()) + "%")
					.andMedmakeLike("%" + (ypxxCustom.getMedmake()==null ? "" : ypxxCustom.getMedmake()) + "%")
					.andMedzlLike("%" + (ypxxCustom.getMedzl()==null ? "" : ypxxCustom.getMedzl()) + "%");
			if (ypxxCustom.getMedclass() != null) {
				criteria.andMedclassEqualTo(ypxxCustom.getMedclass());
			}
			if (ypxxCustom.getMedstate() != null) {

				criteria.andMedstateEqualTo(ypxxCustom.getMedstate());
			}
		}
		
		medinfos = medinfoMapper.selectByExample(example);
		for (Medinfo medinfo : medinfos) {
			YpxxCustom temp = this.FindCusByMed(medinfo);
			System.out.println("temp：" + temp.toString());
			list.add(temp);
		}
		return list;
	}

	public int FindCountByCustom(YpxxCustom ypxxCustom) {
		int count = FindListByCustom(ypxxCustom).size();
		return count;

	}

	public int DelMedByID(String string) {
		int i = medinfoMapper.deleteByPrimaryKey(Integer.parseInt(string));
		return i;
	}

	public Medinfo FindMedByID(String editid) {
		Medinfo info = medinfoMapper.selectByPrimaryKey(Integer.parseInt(editid));
		return info;
	}

	public YpxxCustom FindCustomByID(String id) {
		Medinfo info = medinfoMapper.selectByPrimaryKey(Integer.parseInt(id));
		return this.FindCusByMed(info);
	}

	public int UpdateMed(Medinfo info) {
		return medinfoMapper.updateByPrimaryKeySelective(info);
	}

	public int InsertMed(Medinfo info) {
		return medinfoMapper.insertSelective(info);
	}

}
