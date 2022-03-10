package Exercise7;
import java.util.Scanner;

public class Calculate {
	public static void main (String[]args)
	{
		double mars=2.657;
		double finalweight;
		Scanner input = new Scanner(System.in);  
	    System.out.print("Enter Your Weight(KG):");
	    double weight = input.nextInt(); 
	    System.out.println("Your Weight On Earth Is " + weight+" Kilogram");
	    finalweight=weight/mars;
	    System.out.print("Your Weight On Mars Is ");
	    System.out.printf("%.2f", finalweight);
	    System.out.print(" Kilogram");
	}
}
