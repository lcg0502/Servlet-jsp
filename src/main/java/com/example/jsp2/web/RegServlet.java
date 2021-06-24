package com.example.jsp2.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String code=req.getParameter("code");
        String pwd=req.getParameter("pwd");
        String sex=req.getParameter("sex");
        String [] interests=req.getParameterValues("interest");
        System.out.println(code);
        System.out.println(pwd);
        System.out.println(sex);
        if(interests != null){
            for (String i : interests) {
                System.out.println(i);
            }
        }
        //输出相应信息
        resp.setContentType("text/HTML;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE HTML>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>TimeServlet</title>");
        out.println("<meta charset=\"utf-8\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>注册成功</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
