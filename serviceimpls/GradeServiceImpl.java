package com.grade.web.serviceimpls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.grade.web.daoImpls.GradeDAOImpl;
import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;
import com.grade.web.domains.StudentBean;
import com.grade.web.services.GradeService;

public class GradeServiceImpl implements GradeService{
	private GradeDAO dao;
	
	public GradeServiceImpl() {
			dao = new GradeDAOImpl();
	}

	@Override
	public void createGrade(GradeBean param) {
			param.setHakbun(createHakbun(param));
			dao.insertGrade(param);
	}

	@Override
	public String createHakbun(GradeBean param) {
		Random ran = new Random();
		String hak = "";  																		
		String a = "";
		for(int i =0;i<3;i++) {
			a +=ran.nextInt(10)+"";
		}
		System.out.println("·£´ý°ª:"+a);
		hak = findDate() + "-" + genderChecker(param) + a;
		return hak;
	}

	@Override
	public String findDate() {
		String year = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date date = new Date();
		year = sdf.format(date);
		return year;
	}

	@Override
	public int average(GradeBean param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalScore(GradeBean param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String genderChecker(GradeBean param) {
		String ssn = param.getSsn();
		String result =ssn.substring(7,8);
		return result;
	}


}
