package edu.ncu.safe.domain;

public class SmsInfo {

	public static final int IN = 1;
	public static final int OUT = 2;
	private String address;//对方号码
	private long date;//信息的日期，在数据库里面为int类型
	private int type;//接收/发送
	private String body;//信息主体

	public SmsInfo(String address, long date, int type, String body) {
		this.address = address;
		this.date = date;
		this.type = type;
		this.body = body;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}


	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}