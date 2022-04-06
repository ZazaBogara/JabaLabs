package main;

public class Tree extends Plants {
	public float height;
	
	Tree(String name, int age, float cost, int amount, whenGrow when, float height)
	{
		super(name, age, cost, amount, when);
		this.height = height;
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
		return "\n\nName: " + name + "\nAge: " + age + "\nCost: " + cost + "\nAmount: " + "\ncan be grown in " + grown + "\nheight:" + height; 
	}
}
