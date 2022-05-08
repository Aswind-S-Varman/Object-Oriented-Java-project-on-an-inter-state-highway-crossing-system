//Office.java

class Office{
	private String officeLocation;
	private ArrayList<Form> feedback;
	
	public Office(){}
	public Office(String u, String p, String id, String n, String o){
		super(u,p,id,n);
		officeLocation = o;
		feedback = new ArrayList<Form>();
	}
	public String getOfficeLocation(){
		return officeLocation;
	}
	public void giveFeedback(Form f){
		feedback.add(f);
	}
}
		