//Police.java

class Police extends Account{
	private String policeID;
	private String policeName;
	
	public Police(){ };
	public Police(String u, String p, String id, String n){
		super(u,p);
		policeID = id;
		policeName = n;
	}
	public String getPoliceID(){
		return policeID;
	}
	public String getPoliceName(){
		return policeName;
	}
	public void display(){
		System.out.println("ID number: " + policeID);
		System.out.println("Name: " + policeName);
	}
}