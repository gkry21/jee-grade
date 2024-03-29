package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.GradeBean;
import com.grade.web.domains.StudentBean;
import com.grade.web.serviceimpls.GradeServiceImpl;
import com.grade.web.services.GradeService;

@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		String society = request.getParameter("society");
		GradeBean param = new GradeBean();
		param.setEng(eng);
		param.setKor(kor);
		param.setMath(math);
		param.setSociety(society);
		param.setName(name);
		param.setSsn(ssn);
		GradeService service = new GradeServiceImpl();
		service.createGrade(param);
		response.getWriter().append("Served at: ").append(request.getContextPath());  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
