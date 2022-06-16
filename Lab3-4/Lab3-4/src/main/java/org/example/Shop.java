package org.example;
import java.util.Vector;

public class Shop 
{
	Vector<Plants> catallog = new Vector<Plants>();
	public void sortUp(String type)
	{
		if(type=="cost")
		{
			catallog.sort((o1,o2) -> Double.compare(o1.cost,o2.cost) );
		}
		if(type=="name")
		{
			catallog.sort((o1,o2) -> (o1.name.compareTo(o2.name)) );
		}
	}
	public void sortDown(String type)
	{
		if(type=="cost")
		{
			catallog.sort((o1,o2) -> -Double.compare(o1.cost,o2.cost) );
		}
		if(type=="name")
		{
			catallog.sort((o1,o2) -> -(o1.name.compareTo(o2.name)) );
		}
	}	
	public void searchCanBeGrown(String search)
	{
		Plants.WhenGrow searchWhen = Plants.WhenGrow.valueOf(search);
		for(int i=0;i<catallog.size();i++)
		{
			if(catallog.get(i).canBeGrown==searchWhen) 
			{
				System.out.println(catallog.get(i));
			}
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
