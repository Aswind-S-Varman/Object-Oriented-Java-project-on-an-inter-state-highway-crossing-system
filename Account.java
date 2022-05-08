//Account.java

class Account{
	private String username;
	private String password;
	
	public Account(){}
	public Account(String u, String p){
		username = u;
		password = p;
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public abstract void display(){ }
}