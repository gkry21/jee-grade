package com.grade.web.domains;

import java.io.Serializable;

public class GradeBean implements Serializable{
		private String hakbun,name, ssn,kor, eng,math,society;
		
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

		public String getKor() {
			return kor;
		}

		public void setKor(String kor) {
			this.kor = kor;
		}

		public String getEng() {
			return eng;
		}

		public void setEng(String eng) {
			this.eng = eng;
		}

		public String getMath() {
			return math;
		}

		public void setMath(String math) {
			this.math = math;
		}

		public String getSociety() {
			return society;
		}

		public void setSociety(String society) {
			this.society = society;
		}

		@Override
		public String toString() {
			return "GradeBean [hakbun=" + hakbun + ", name=" + name + ", ssn=" + ssn + ", kor=" + kor + ", eng=" + eng
					+ ", math=" + math + ", society=" + society + "]";
		}

}
