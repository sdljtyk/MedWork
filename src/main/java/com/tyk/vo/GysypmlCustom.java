package com.tyk.vo;

import com.tyk.pojo.Ghsmed;

/**
 * 供货商药品目录信息自定义vo
 *
 */
public class GysypmlCustom extends Ghsmed{
	
	private String mednumber;
	private String medjx;
	private String medgg;
	private String medmake;
	private String medname;
	private String jyztmc;
	private String lbmc;
	private String zlccmc;
	private int medclass;
	private int medstate;
	//供应商名称
	private String GHSName;
	//供货状态名称
	private String controlmc;
	
	public String getMednumber() {
		return mednumber;
	}
	public void setMednumber(String mednumber) {
		this.mednumber = mednumber;
	}
	public String getMedjx() {
		return medjx;
	}
	public void setMedjx(String medjx) {
		this.medjx = medjx;
	}
	public String getMedgg() {
		return medgg;
	}
	public void setMedgg(String medgg) {
		this.medgg = medgg;
	}
	public String getMedmake() {
		return medmake;
	}
	public void setMedmake(String medmake) {
		this.medmake = medmake;
	}
	public String getMedname() {
		return medname;
	}
	public void setMedname(String medname) {
		this.medname = medname;
	}
	public String getJyztmc() {
		return jyztmc;
	}
	public void setJyztmc(String jyztmc) {
		this.jyztmc = jyztmc;
	}
	public int getMedclass() {
		return medclass;
	}
	public void setMedclass(int medclass) {
		this.medclass = medclass;
	}
	public int getMedstate() {
		return medstate;
	}
	public void setMedstate(int medstate) {
		this.medstate = medstate;
	}
	public String getGHSName() {
		return GHSName;
	}
	public void setGHSName(String gHSName) {
		GHSName = gHSName;
	}
	public String getControlmc() {
		return controlmc;
	}
	public void setControlmc(String controlmc) {
		this.controlmc = controlmc;
	}
	
	
	public String getLbmc() {
		return lbmc;
	}
	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}
	public String getZlccmc() {
		return zlccmc;
	}
	public void setZlccmc(String zlccmc) {
		this.zlccmc = zlccmc;
	}
	@Override
	public String toString() {
		return "GysypmlCustom [mednumber=" + mednumber + ", medjx=" + medjx + ", medgg=" + medgg + ", medmake="
				+ medmake + ", medname=" + medname + ", jyztmc=" + jyztmc + ", medclass=" + medclass + ", medstate="
				+ medstate + ", GHSName=" + GHSName + ", controlmc=" + controlmc + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
