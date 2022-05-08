class Fine
{
	private String FineType;

	public Fine(){}
	public Fine(String FineType)
	{
		this.FineType = FineType;
	}

	public String getFineType()
	{
		return "Fine Reason: " + FineType;
	}
}