package com.tyk.vo;

import java.util.List;

import com.tyk.pojo.Ghsunit;
import com.tyk.pojo.Xzqy;

public class GHSCustom extends Ghsunit{

	String dqmc;
	List<Xzqy> dqs;
	
	public String getDqmc() {
		return dqmc;
	}

	public void setDqmc(String dqmc) {
		this.dqmc = dqmc;
	}

	public List<Xzqy> getDqs() {
		return dqs;
	}

	public void setDqs(List<Xzqy> dqs) {
		this.dqs = dqs;
	}
	
	
	
}
