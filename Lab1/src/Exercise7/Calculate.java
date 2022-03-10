package Exercise7;
import java.util.Scanner;

public class Calculate {
	public static void main (String[]args)
	{
		calculating();
	}
	public static double finalweight;
	public static double weight;
	public static void calculating()
	{
		double mars=2.657;
		Scanner input = new Scanner(System.in);  
	    System.out.print("Enter Your Weight(KG):");
	    weight = input.nextDouble(); 
	    System.out.println("Your Weight On Earth Is " + weight+" Kilogram");
	    finalweight=weight/mars;
	    System.out.print("Your Weight On Mars Is ");
	    System.out.printf("%.2f", finalweight);
	    System.out.print(" Kilogram");
	}
}
