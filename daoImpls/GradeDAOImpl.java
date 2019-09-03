package com.grade.web.daoImpls;

import java.io.File;
import java.io.BufferedWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;

public class GradeDAOImpl implements GradeDAO {
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee-grade%sWebContent%sresources%stxt%s",
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator
			);
	@Override
	public void insertGrade(GradeBean param) {
		System.out.println("insertGrade :"+param.toString());
		try {
			File file = new File(FILE_PATH+ "grade.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write("이름 :"+param.getName()+",학번 :"+param.getHakbun()+", 국어 :"+param.getKor()+", 영어 :"
									+param.getEng()+", 수학 :"+param.getMath()+", 사회:"+param.getSociety());
			writer.newLine();
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
