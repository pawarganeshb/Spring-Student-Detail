package com.app;

public class Students {
   
	//	POJO Class
	
	private String stuName;
	private long mobileNo;
	private String sId;
	
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	@Override
	public String toString() {
		return "Students [stuName=" + stuName + ", mobileNo=" + mobileNo + ", sId=" + sId + "]";
	}
	
	
}
