package main;
import java.util.Vector;

public class shop 
{
	Vector<Plants> catallog = new Vector<Plants>();
	public void sortUp(float cost)
	{
		
	}
	public void sortDown(float cost)
	{
		
	}	
	public void searchCanBeGrown(String search)
	{
		switch(search)   //Енум належить класу рослин, а не класу Магазина
		{
		case "Spring":
			break;
		case "Outumn":
			break;
		case "Winter":
			break;
		case "Summer":
			break;
		default:
			break;
		}
		
	}
	public void addToCatalog(Plants object) 
	{
		if(catallog.contains(object))
			catallog.elementAt(catallog.lastIndexOf(object)).amount++;
		else
			catallog.addElement(object);
	}
	public void removeFromCatalog(Plants object, int amount)
	{
		int found = catallog.lastIndexOf(object);
		catallog.elementAt(found).amount--;
		if(catallog.elementAt(found).amount == 0)
			catallog.remove(found);
	}
}
