package ys;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
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
import javax.swing.plaf.synth.SynthScrollBarUI;

import org.apache.jasper.tagplugins.jstl.core.Url;

import com.alibaba.fastjson.JSON;

@WebServlet("/t1.do")
public class Test extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code = req.getParameter("code");
		String urls = "https://api.weixin.qq.com/sns/jscode2session?"
					+"appid=wx3e56e9d55a123ec8"
					+"&secret=1e1742bb28cc8d9a4e9b428f02b8aaab"
					+"&js_code="+code+"&grant_type=authorization_code";
		URL url = new URL(urls);
		
		HttpURLConnection conn = (HttpURLConnection) 
							url.openConnection();
		
		InputStream is = conn.getInputStream();
		//{"session_key":"GuA\/sF7o2g19NmasoOOaxA==",
		//"openid":"o6v-P4pmcBClGgzHG8HcVG5XqOTY"}
		int t ;
		byte [] b = new byte[1024];
		while((t = is.read(b))!=-1){
			break;
		}
		String s = new String(b,0,t);
		Open open = JSON.parseObject(s, Open.class);
		System.out.println(open);
	}
}
