package com.tyk.vo;

import java.util.ArrayList;
import java.util.List;

import com.tyk.pojo.Backinfo;
import com.tyk.pojo.Backs;

public class BackCustom extends Backs {
	private String yyname;
	private String backstatename;
	private List<Backinfo> yythdmxs = new ArrayList<Backinfo>();

	public String getYyname() {
		return yyname;
	}

	public void setYyname(String yyname) {
		this.yyname = yyname;
	}

	public String getBackstatename() {
		return backstatename;
	}

	public void setBackstatename(String backstatename) {
		this.backstatename = backstatename;
	}

	public List<Backinfo> getYythdmxs() {
		return yythdmxs;
	}

	public void setYythdmxs(List<Backinfo> yythdmxs) {
		this.yythdmxs = yythdmxs;
	}
}
