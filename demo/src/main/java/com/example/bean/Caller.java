package com.example.bean;

import java.sql.Date;

public class Caller {
	private int callerid;
	private String callernumber;
	private String callername;
	private String Calledon;
	public int getCallerid() {
		return callerid;
	}
	public void setCallerid(int callerid) {
		this.callerid = callerid;
	}
	public String getCallernumber() {
		return callernumber;
	}
	public void setCallernumber(String callernumber) {
		this.callernumber = callernumber;
	}
	public String getCallername() {
		return callername;
	}
	public void setCallername(String callername) {
		this.callername = callername;
	}
	public String getCalledon() {
		return Calledon;
	}
	public void setCalledon(String calledon) {
		Calledon = calledon;
	}
	@Override
	public String toString() {
		return "Caller [callerid=" + callerid + ", callernumber=" + callernumber + ", callername=" + callername
				+ ", Calledon=" + Calledon + "]";
	}
	

}
