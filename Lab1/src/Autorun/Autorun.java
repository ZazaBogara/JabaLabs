package Autorun;

record Autorun(String Country, int days, int price, boolean payed, String owner, String model)
{
	private static final boolean isOnCar = true; 
	public Autorun(String Country, int days, int price)
	{
		this(Country, days, price, true, "Zakhar", "Opel");
	}
	public Autorun()
	{
		this("Ukraine", 10, 20, true, "Zakhar", "Opel");
	}
	
	@Override
	public String toString()
	{
		return "Country:"+Country+"\ndays:"+days+"\nprice:"+price+"\npayed:"+payed+"\nowner:"+owner+"\nmodel:"+model;
	}
	public static boolean isOnCar() 
	{
		return isOnCar;
	}
}