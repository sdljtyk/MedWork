package com.tyk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.DicinfoMapper;
import com.tyk.mapper.GhsmedMapper;
import com.tyk.mapper.GhsunitMapper;
import com.tyk.mapper.MedinfoMapper;
import com.tyk.mapper.YymedMapper;
import com.tyk.pojo.Ghsmed;
import com.tyk.pojo.GhsmedExample;
import com.tyk.pojo.Medinfo;
import com.tyk.pojo.MedinfoExample;
import com.tyk.pojo.MedinfoExample.Criteria;
import com.tyk.pojo.Yymed;
import com.tyk.pojo.YymedExample;
import com.tyk.vo.GysypmlCustom;
import com.tyk.vo.YpxxCustom;

@Service
public class MedService {

	@Autowired
	private MedinfoMapper medinfoMapper;
	@Autowired
	private DicinfoMapper dicinfoMapper;
	@Autowired
	private GhsmedMapper ghsmedMapper;
	@Autowired
	private GhsunitMapper ghsunitMapper;
	@Autowired
	private YymedMapper yymedMapper;

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
	
	public GysypmlCustom FindGhsCusByGhsMedAndMed(Ghsmed ghsmed,Medinfo medinfo)
	{
		GysypmlCustom temp = new GysypmlCustom();
		String lbmc = dicinfoMapper.selectByPrimaryKey(medinfo.getMedclass()).getInfo();
		String zlccmc = dicinfoMapper.selectByPrimaryKey(Integer.parseInt(medinfo.getMedzl())).getInfo();
		String jyztmc = dicinfoMapper.selectByPrimaryKey(medinfo.getMedstate()).getInfo();
		String controlmc = dicinfoMapper.selectByPrimaryKey(ghsmed.getGhsmedstate()).getInfo();
		String gHSName = ghsunitMapper.selectByPrimaryKey(ghsmed.getGhsunitid()).getGhsname();
		temp.setId(ghsmed.getId());
		temp.setControlmc(controlmc);
		temp.setGhsmedstate(ghsmed.getGhsmedstate());
		temp.setGHSName(gHSName);
		temp.setGhsunitid(ghsmed.getGhsunitid());
		temp.setJyztmc(jyztmc);
		temp.setLbmc(lbmc);
		temp.setMedclass(medinfo.getMedclass());
		temp.setMeddj(ghsmed.getMeddj());
		temp.setMedgg(medinfo.getMedgg());
		temp.setMedid(ghsmed.getMedid());
		temp.setMedjx(medinfo.getMedjx());
		temp.setMedmake(medinfo.getMedmake());
		temp.setMedname(medinfo.getMedname());
		temp.setMednumber(medinfo.getMednumber());
		temp.setMedstate(medinfo.getMedstate());
		temp.setZlccmc(zlccmc);
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
	
	public List<GysypmlCustom> FindListByGysCustom(GysypmlCustom gysypmlCustom,String unitid) {
		List <GysypmlCustom> list = new ArrayList<GysypmlCustom>();
		List<Medinfo> medinfos = new ArrayList<Medinfo>();
		List<Ghsmed> ghsmeds = new ArrayList<Ghsmed>();
		MedinfoExample example = new MedinfoExample();
		GhsmedExample ghsexample = new GhsmedExample();
		
		if (gysypmlCustom != null) {
			Criteria criteria = example.createCriteria();
			criteria.andMednameLike("%" + (gysypmlCustom.getMedname()==null ? "" : gysypmlCustom.getMedname()) + "%")
					.andMedjxLike("%" + (gysypmlCustom.getMedjx()==null ? "" : gysypmlCustom.getMedjx()) + "%")
					.andMedggLike("%" + (gysypmlCustom.getMedgg()==null ? "" : gysypmlCustom.getMedgg()) + "%")
					.andMedmakeLike("%" + (gysypmlCustom.getMedmake()==null ? "" : gysypmlCustom.getMedmake()) + "%");
			if (gysypmlCustom.getMedclass() != 0) {
				criteria.andMedclassEqualTo(gysypmlCustom.getMedclass());
			}
			if (gysypmlCustom.getMedstate() != 0) {
				criteria.andMedstateEqualTo(gysypmlCustom.getMedstate());
			}
			com.tyk.pojo.GhsmedExample.Criteria criteria2 = ghsexample.createCriteria();
			if(gysypmlCustom.getMeddj()!= null)
				criteria2.andMeddjLessThanOrEqualTo(gysypmlCustom.getMeddj());
			if(gysypmlCustom.getGhsmedstate()!= null && gysypmlCustom.getGhsmedstate()!= 0)
				criteria2.andGhsmedstateEqualTo(gysypmlCustom.getGhsmedstate());
			if(unitid!=null)
				criteria2.andGhsunitidEqualTo(Integer.parseInt(unitid));
		}
		medinfos = medinfoMapper.selectByExample(example);
		ghsmeds = ghsmedMapper.selectByExample(ghsexample);
		for (Ghsmed ghsmed : ghsmeds) {
			for (Medinfo  medinfo : medinfos) {
				GysypmlCustom temp = new GysypmlCustom();
				if(ghsmed.getMedid() == medinfo.getId())
				{
					temp = this.FindGhsCusByGhsMedAndMed(ghsmed,medinfo);
					
					list.add(temp);
				}
			}
		}
		return list;
	}

	
	public int FindCountByGysCustom(GysypmlCustom gysypmlCustom,String unitid) {
		int count = FindListByGysCustom(gysypmlCustom,unitid).size();
		return count;
	}

	public int UpGhStateByID(String string, String string2) {
		Ghsmed ghsmed = ghsmedMapper.selectByPrimaryKey(Integer.parseInt(string));
		ghsmed.setGhsmedstate(Integer.parseInt(string2));
		return ghsmedMapper.updateByPrimaryKeySelective(ghsmed);
	}

	public List<YpxxCustom> FindYYmedListByCusAndYYid(YpxxCustom ypxxCustom, int yyid) {
		List<YpxxCustom> list = new ArrayList<YpxxCustom>();
		YymedExample example = new YymedExample();
		example.createCriteria().andYyidEqualTo(yyid);
		List<Yymed> yymeds = yymedMapper.selectByExample(example);
		List<YpxxCustom> temp = FindListByCustom(ypxxCustom);
		for (Yymed yymed : yymeds) {
			for (YpxxCustom ypxxCustom2 : temp) {
				if(yymed.getMedid() == ypxxCustom2.getId()) {
					ypxxCustom2.setYymedid(yymed.getId());
					ypxxCustom2.setMedsum(yymed.getMedsum());
					list.add(ypxxCustom2);
				}
			}
		}
		return list;
	}

	public int FindYYmedCountByCusAndYYid(YpxxCustom ypxxCustom, int yyid) {
		int count = FindYYmedListByCusAndYYid(ypxxCustom, yyid).size();
		return count;
	}

	public int DelYYMedByID(String string) {
		Yymed yymed = yymedMapper.selectByPrimaryKey(Integer.parseInt(string));
		System.out.println("yymed:"+yymed);
		if(yymed.getMedsum() == 0)
			return yymedMapper.deleteByPrimaryKey(Integer.parseInt(string));
		else
			return 0;
			
		
	}

	public int UpdateGhsMedDJ(Ghsmed ghsmed) {
		if(ghsmed.getMeddj() == 0)
			ghsmed.setMeddj(null);
		if(ghsmed.getMeddj() != 0)
			ghsmed.setGhsmedstate(16);
		
		return ghsmedMapper.updateByPrimaryKeySelective(ghsmed);
	}

	public int DelGhsMedByID(String string) {
		return ghsmedMapper.deleteByPrimaryKey(Integer.parseInt(string));
	}

	public List<YpxxCustom> FindGhsAddListByCustom(YpxxCustom ypxxCustom, String unitID) {
		List<YpxxCustom> list = new ArrayList<YpxxCustom>();
		GhsmedExample exam = new GhsmedExample();
		exam.createCriteria().andGhsunitidEqualTo(Integer.parseInt(unitID));
		List<Ghsmed> ghsmeds = ghsmedMapper.selectByExample(exam);
		
		List<Integer> ids = new ArrayList<Integer>();
		for (Ghsmed ghsmed : ghsmeds) {
			ids.add(ghsmed.getMedid());
		}
		
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
			if(ids.size()>0)
				criteria.andIdNotIn(ids);
		}
		medinfos = medinfoMapper.selectByExample(example);
		for (Medinfo medinfo : medinfos) {
			YpxxCustom temp = this.FindCusByMed(medinfo);
			list.add(temp);
		}
		return list;
	}

	public int FindGhsAddCountByCustom(YpxxCustom ypxxCustom, String unitID) {
		int count = FindGhsAddListByCustom(ypxxCustom, unitID).size();
		return count;
	}

	public int InsertGhsMed(Ghsmed ghsmed) {
		return ghsmedMapper.insertSelective(ghsmed);
	}
}
