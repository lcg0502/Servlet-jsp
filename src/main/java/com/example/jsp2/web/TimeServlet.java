package com.example.jsp2.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

public class TimeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration a=req.getHeaderNames();
        while (a.hasMoreElements()){
            String key=(String) a.nextElement();
            String value=req.getHeader(key);
            System.out.println(key+":"+value);
        }
        System.out.println(req.getMethod());//请求方法;
        System.out.println(req.getServletPath());//请求路径
        System.out.println("协议类型" + req.getProtocol());//请求协议
        resp.setContentType("text/html");//告诉浏览器给它输出的是什么格式的内容
        Date date = new Date();
        SimpleDateFormat sdf =
                new SimpleDateFormat("HH:mm:ss");
        String now = sdf.format(date);
        PrintWriter out=resp.getWriter();
        out.println("<!DOCTYPE HTML>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>TimeServlet</title>");
        out.println("<meta charset='utf-8'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>"+now+"</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
