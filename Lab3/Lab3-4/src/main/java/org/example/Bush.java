package MyJabaLabs.mavenproject;

public class Bush extends Plants {
	protected boolean spikes;
 
 Bush(String name, int age, float cost, int amount, WhenGrow when, boolean spikes)
 {
	 super(name, age, cost, amount, when);
	 this.spikes = spikes;
 }
 
 @Override
 public String toString(){
		String grown = "";
		grown = canBeGrown.toString();
		return "\n\nName: " + name + "\nAge: " + age + "\nCost: " + cost + "\nAmount: " + amount  + "\ncan be grown in " + grown + "\nIs spikes:" + (spikes?"Yes":"No");
		 
	}
}
