package org.example;

public class Flowers extends Plants {
	
	protected enum Color {Red, Green, Blue, Yellow};
	
	protected Color color;
	
	Flowers(String name, int age, float cost, int amount, WhenGrow when, Color ownColor)
	{
		super(name, age, cost, amount, when);
		this.color = ownColor;
	}
	
	
	@Override
    public String toString(){
		String grown = "";
		String ownColor = "";
		grown = canBeGrown.toString();
		ownColor = color.toString();
		return "\n\nName: " + name + "\nAge: " + age + "\nCost: " + cost + "\nAmount: "  + amount  + "\ncan be grown in " + grown + "\nColor: " + ownColor; 
	}
}
