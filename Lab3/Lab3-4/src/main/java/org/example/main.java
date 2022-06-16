package MyJabaLabs.mavenproject;



public class main 
{	
	public static void main(String args[]){
		Shop myShop = new Shop();
	
		Tree oak = new Tree("oak", 1, 100, 1, Plants.WhenGrow.Spring, 56);
		Tree oak1 = new Tree("oak", 1, 1000, 1, Plants.WhenGrow.Spring, 56);
		myShop.addToCatalog(oak);
		myShop.addToCatalog(oak1);
		myShop.sortUp("cost");
		System.out.println(myShop.catallog.get(0));
		System.out.println(myShop.catallog.get(1));
		System.out.println("\n\nSORTED:");
		myShop.sortDown("cost");
		System.out.println(myShop.catallog.get(0));
		System.out.println(myShop.catallog.get(1));
	}
}
