package com.grade.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private String hakbun,name, ssn;

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "학생정보 [이름=" + name + 
					", 주민번호=" + ssn + "]";
	}
	
}
