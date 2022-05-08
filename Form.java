public class Form
{
	private String applicantForm;
	private String IDCard;
	private String DocumentCheck;
	private Destination dest;
	private HealthDeclaration health;

	public Form(){}

	public Form(Destination dest, HealthDeclaration health, String applicantForm, String IDCard, String DocumentCheck)
	{
		this.dest = dest;
		this.health = health;
		this.applicantForm = applicantForm;
		this.IDCard = IDCard;
		this.DocumentCheck = DocumentCheck;
	}

	public String getApplicantForm()
	{
		return applicantForm;
	}

	public String getIDCard()
	{
		return IDCard;
	}

	public String getDocCheck()
	{
		return DocumentCheck;
	}

	public void displayForm()
	{
		System.out.println("---------------------------------");
		System.out.println("Form Details");
		System.out.println("Applicant Form: " + applicantForm);
		System.out.println("ID Card number: " + IDCard);
		System.out.println("Location details");
		System.out.println(dest.toString());
		System.out.println("Health Declaration Details");
		System.out.println(health.toString());
		System.out.println("---------------------------------");
		System.out.println();
	}

}
