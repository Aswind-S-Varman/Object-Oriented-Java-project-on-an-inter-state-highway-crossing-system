public class HealthDeclaration
{
	private int HealthDec_No;
	private String HealthDec_Owner;

	public HealthDeclaration(int HealthDec_No, String HealthDec_Owner)
	{
		this.HealthDec_No = HealthDec_No;
		this.HealthDec_Owner = HealthDec_Owner;
	}

	public String toString()
	{
		return ("Health Declaration Number: " + HealthDec_No + "\nHealth Declaration Owner: " +HealthDec_Owner);
	}
}