package Autorun;

public class Main 
{
	public static void main(String[] args)
	{
		Autorun one = new Autorun();
		Autorun two = new Autorun("Turkie", 10, 20);
		Autorun three = new Autorun("Egypt", 10, 20, true, "Pablo", "Toyota");
		
		System.out.println(Autorun.isOnCar());
		System.out.println("\n \n");
		System.out.println(one);
		System.out.println("\n \n");
		System.out.println(two);
		System.out.println("\n \n");
		System.out.println(three);
		System.out.println("\n \n");
	}
}
