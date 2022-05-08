import java.util.ArrayList;

public class Applicant extends Account implements Compound
{
	private String ApplicantID;
	private String ApplicantName;
	private ArrayList <Form> listOfPassenger;		// Association
	private ArrayList<Fine> fineCompound;
	private int totalPassenger;

	public Applicant(){}

	public Applicant(String u, String p, String ApplicantID, String ApplicantName, int totalPassenger)
	{
		super(u,p);
		this.ApplicantID = ApplicantID;
		this.ApplicantName = ApplicantName;
		this.totalPassenger = totalPassenger;
		listOfPassenger = new ArrayList <Form>();		// Association
		fineCompound = new ArrayList<Fine>();
	}

	public String getApplicantID()
	{
		return ApplicantID;
	}

	public String getApplicantName()
	{
		return ApplicantName;
	}

	public int getTotalPassenger()
	{
		return totalPassenger;
	}

	public void create(Form a)
	{
		listOfPassenger.add(a);					// Association
	}

	public double calcCompound()
	{
		return COMPOUND_RATE;
	}
	
	public void giveFine(Fine f)
	{
		fineCompound.add(f);
	}
	
	public void display()
	{
		System.out.println("Applicant ID: " + ApplicantID);
		System.out.println("Applicant Name: " + ApplicantName);
		System.out.println("Total passengers: " + totalPassenger);
		System.out.println("Checking for Fine ...");
		for (int i = 0; i < listOfPassenger.size(); i++)
		{
			System.out.println(listOfPassenger.get(i).getDocCheck());
			if(listOfPassenger.get(i).getDocCheck() == "FAIL")
			{
				for(int j = 0; j <fineCompound.size(); j++)
				{
					System.out.println(fineCompound.get(j).getFineType());
					System.out.println("The fine is: RM " + calcCompound());
				}
			}
			listOfPassenger.get(i).displayForm();
		}
	}
}