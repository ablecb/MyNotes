package cb.test;

public class loginQ {
	private String userName;
	private String userPass;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String login(){
		if(("caobo").equals(userName)){
			return "y";
		}else{
			return "n";
		}
	}
}
