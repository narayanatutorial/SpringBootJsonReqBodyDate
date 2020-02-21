package com.narayanatutorial.request;

import java.applet.AudioClip;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RequestDetails extends Audit{

	String name;
	String address;
	
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Kolkata" )
	private Date initDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getInitDate() {
		return initDate;
	}
	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}
	
	
	
}
