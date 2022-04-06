package main;

public class Flowers extends Plants {
	public enum Color {Red, Green, Blue, Yellow};
	
	public Color color;
	
	Flowers(String name, int age, float cost, int amount, whenGrow when, Color ownColor)
	{
		super(name, age, cost, amount, when);
		this.color = ownColor;
	}
	
	
	@Override
    public String toString(){
		String grown = "";
		String ownColor = "";
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
		switch(color)
		{
		case Red:
			ownColor = "Red";
			break;
		case Green:
			ownColor = "Green";
			break;
		case Blue:
			ownColor = "Blue";
			break;
		case Yellow:
			ownColor = "Yellow";
			break;
		default:
			break;
		}
		return "\n\nName: " + name + "\nAge: " + age + "\nCost: " + cost + "\nAmount: " + "\ncan be grown in " + grown + "\nColor: " + ownColor; 
	}
}
