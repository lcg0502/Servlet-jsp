package com.example.jsp2.web;

import com.example.jsp2.entity.Course;
import com.example.jsp2.entity.Student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FindServlet extends HttpServlet {

	@Override
	protected void service(
		HttpServletRequest req, 
		HttpServletResponse res) 
		throws ServletException, IOException {
		//模拟查询学生
		Student stu = new Student();
		stu.setName("zhangsan");
		stu.setAge(23);
		stu.setSex("M");
		stu.setInterests(
			new String[]{"篮球","足球","排球"});
		Course c = new Course();
		c.setId(1);
		c.setName("Java");
		c.setDays(80);
		stu.setCourse(c);
		//转发
		req.setAttribute("stu", stu);
		req.getRequestDispatcher(
			"find.jsp").forward(req, res);
	}
	
}











