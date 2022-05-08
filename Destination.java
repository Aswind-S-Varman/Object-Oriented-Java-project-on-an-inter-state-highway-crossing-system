public class Destination
{
	private String Location_Address;
	private String Location_Destination;

	public Destination(String Location_Address, String Location_Destination)
	{
		this.Location_Address = Location_Address;
		this.Location_Destination = Location_Destination;
	}

	public String toString()
	{
		return ("Location of Address: "+Location_Address+"\nLocation of Destination: "+ Location_Destination);
	}
}