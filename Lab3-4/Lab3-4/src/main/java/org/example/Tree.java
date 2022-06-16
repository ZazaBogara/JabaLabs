package org.example;

public class Tree extends Plants {
	protected float height;
	
	Tree(String name, int age, float cost, int amount, WhenGrow when, float height)
	{
		super(name, age, cost, amount, when);
		this.height = height;
	}
	
	@Override
    public String toString(){
		String grown = "";
		grown = canBeGrown.toString();
		return "\n\nName: " + name + "\nAge: " + age + "\nCost: " + cost + "\nAmount: " + amount  + "\ncan be grown in " + grown + "\nheight:" + height; 
	}
}
