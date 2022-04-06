package main;

public class Bush extends Plants {
 public boolean spikes;
 
 Bush(String name, int age, float cost, int amount, whenGrow when, boolean spikes)
 {
	 super(name, age, cost, amount, when);
	 this.spikes = spikes;
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
		return "\n\nName: " + name + "\nAge: " + age + "\nCost: " + cost + "\nAmount: " + "\ncan be grown in " + grown + "\nIs spikes:" + (spikes?"Yes":"No"); 
	}
}
