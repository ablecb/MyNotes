package cb.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class MyUp {
	File file;
	FileInputStream is;
	public void downLoad() throws Exception{
		String fileName="jdbc1.tar";
		file=new File("G:/"+fileName);
		is=new FileInputStream(file);
		HttpServletResponse res=ServletActionContext.getResponse();
		res.setHeader("Content-Disposition", "attachment;filename="+fileName);
		 //不允许对该请求信息进行缓存
//		 res.addHeader("Pargam", "no-cache");
//		 res.addHeader("Cache-Control", "no-cache");
		 ServletOutputStream sos=res.getOutputStream();
		 int t = 0;
		 while((t = is.read())!=-1){
			 sos.write(t);
		 }
		 sos.close();
		 is.close();
	}
}
