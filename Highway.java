//Highway.java

class Highway extends Police{
	private String policeLocation;
	private ArrayList <Applicant> checkApplicant;
	
	public Highway(){}
	public Highway(String u, String p, String id, String n, String l){
		super(u,p,id,n);
		policeLocation = l;
		checkApplicant = new ArrayList<Applicant>();
	}
	public String getPoliceLocation(){
		return policeLocation;
	}
	public void checkingApp(Applicant a){
		checkApplicant.add(a);
	}
}
		
		