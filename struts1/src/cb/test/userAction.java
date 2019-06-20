package cb.test;

import com.opensymphony.xwork2.ModelDriven;

public class userAction implements ModelDriven<User>{

	private User user=new User();
	public User getModel() {
		System.out.println("fdsfhds");
		
		return user;
	}
	public String login(){
		String s=user.getUserName();
		if("cao".equals(s)){
			return "y";
		}else{
			return "n";
		}
	}

}
