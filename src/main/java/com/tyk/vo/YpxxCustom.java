package com.tyk.vo;

import com.tyk.pojo.Medinfo;


/**
 * 药品信息自定义数据模型
 * @author sdljtyk
 * 
 */
public class YpxxCustom extends Medinfo{

	//药品类别名称
	private String lbmc;
	//质量层次名称
	private String zlccmc;
	//交易状态名称
	private String jyztmc;
	
	private int medsum;
	private int yymedid;
	
	public int getYymedid() {
		return yymedid;
	}
	public void setYymedid(int yymedid) {
		this.yymedid = yymedid;
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
	public String getJyztmc() {
		return jyztmc;
	}
	public void setJyztmc(String jyztmc) {
		this.jyztmc = jyztmc;
	}
	public int getMedsum() {
		return medsum;
	}
	public void setMedsum(int medsum) {
		this.medsum = medsum;
	}
	
	
}
