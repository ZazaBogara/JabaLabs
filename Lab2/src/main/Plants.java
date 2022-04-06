package main;



public class Plants 
{
	public enum whenGrow {Summer, Winter, Spring, Outumn};
	
	public String name;
	public int age;
	public whenGrow canBeGrown; 
	public float cost;
	public int amount;
	
	Plants(String name, int age, float cost, int amount, whenGrow when)
	{
		this.name = name;
		this.age = age;
		this.cost = cost;
		this.amount = amount;
		this.canBeGrown = when;
	}
	
	@Override
    public String toString(){
		String grown = "";
		switch(canBeGrown)
		{
		case Summer:
			grown = "Summer";
			break;
		case Spring:
			grown = "Spring";
			break;
		case Outumn:
			grown = "Outumn";
			break;
		case Winter:
			grown = "Winter";
			break;
		default:
			break;
		}
		return "\n\nName: " + name + "\nAge: " + age + "\nCost: " + cost + "\nAmount: " + "\ncan be grown in " + grown; 
	}
}
