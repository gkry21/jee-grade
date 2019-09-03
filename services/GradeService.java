package com.grade.web.services;

import com.grade.web.domains.GradeBean;
import com.grade.web.domains.StudentBean;

public interface GradeService {
		public void createGrade(GradeBean param);
		public String createHakbun(GradeBean param);
		public String findDate();
		public int average(GradeBean param);
		public int totalScore(GradeBean param);
		public String genderChecker(GradeBean param);
}
