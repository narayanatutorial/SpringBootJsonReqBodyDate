package com.narayanatutorial.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Audit {

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Kolkata")
	private Date auditDate;

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

}
