package ys;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

@WebServlet("/m1.do")
public class MyServer extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet......");
		
		System.out.println(req.getRequestURI());
	
		
		try {
			String ss = req.getParameter("findV");
			//ss  = new String(ss.getBytes("ISO-8859-1"),"UTF-8");
			
			System.out.println(ss);
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ys","root","123456");
			
			Statement sta = conn.createStatement();
			
			ResultSet rs = sta.executeQuery("SELECT * FROM question");
			
			List<Que> listQ = new ArrayList<Que>();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			while(rs.next()){
				Que q = new Que();
				q.setId(rs.getInt("id"));
				q.setTitle(rs.getString("title"));
				
				String t = format.format(rs.getTimestamp("create_time"));
				q.setTime(t);
				
				listQ.add(q);
			}
			//json
			
			String s = JSON.toJSONString(listQ);
			
			resp.setContentType("text/html;charset=utf-8");
			
			PrintWriter pw = resp.getWriter();
			pw.write(s);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost......");
		//req.setCharacterEncoding("utf-8");
		//System.out.println(req.getRequestURI());
		try {
			String ss = req.getParameter("findV");
			
			
			
			
			System.out.println(ss);
			
			
			
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ys","root","123456");
			
			Statement sta = conn.createStatement();
			
			ResultSet rs = sta.executeQuery("SELECT * FROM question");
			
			List<Que> listQ = new ArrayList<Que>();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			while(rs.next()){
				Que q = new Que();
				q.setId(rs.getInt("id"));
				q.setTitle(rs.getString("title"));
				
				String t = format.format(rs.getTimestamp("create_time"));
				q.setTime(t);
				
				listQ.add(q);
			}
			//json
			
			String s = JSON.toJSONString(listQ);
			
			resp.setContentType("text/html;charset=utf-8");
			
			PrintWriter pw = resp.getWriter();
			pw.write(s);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
