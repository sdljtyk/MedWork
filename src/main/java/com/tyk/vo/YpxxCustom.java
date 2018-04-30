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
	//价格上限
	private Float zbjgupper;
	//价格下限
	private Float zbjglower;
	
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
	public Float getZbjgupper() {
		return zbjgupper;
	}
	public void setZbjgupper(Float zbjgupper) {
		this.zbjgupper = zbjgupper;
	}
	public Float getZbjglower() {
		return zbjglower;
	}
	public void setZbjglower(Float zbjglower) {
		this.zbjglower = zbjglower;
	}
	public String getLbmc() {
		return lbmc;
	}
	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}
	
	
}
