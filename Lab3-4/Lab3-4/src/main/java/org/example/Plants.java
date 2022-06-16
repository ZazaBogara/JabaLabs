package org.example;



public class Plants 
{
	protected enum WhenGrow {Summer, Winter, Spring, Outumn};
	
	protected String name;
	protected int age;
	protected WhenGrow canBeGrown; 
	protected float cost;
	protected int amount;
	
	Plants(String name, int age, float cost, int amount, WhenGrow when)
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
		grown = canBeGrown.toString();
		return "\n\nName: " + name + "\nAge: " + age + "\nCost: " + cost + "\nAmount: " + amount + "\ncan be grown in " + grown; 
	}
}
