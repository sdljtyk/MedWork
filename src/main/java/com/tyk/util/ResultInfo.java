package com.tyk.util;

public class ResultInfo {
	private int type;//结果类型（0：失败；1：成功；2：警告；3：提示）
	private String message;//返回信息
	private Object data;
	
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ResultInfo() {}
	public ResultInfo(int type,String message)
	{
		this.type=type;
		this.message=message;
	}
	
	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return message;
	}
	
}
