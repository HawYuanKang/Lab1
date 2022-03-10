package Exercise8;
import java.util.Scanner;
import Exercise7.Calculate;

public class StoreList {
	public static void main (String[]args)
	{
		System.out.print("How Many Person Want To Calculate: ");
		Scanner input2 = new Scanner(System.in);  
		int person = input2.nextInt(); 
		double EarthWeight[]=new double[person];
		double MarsWeight[]=new double[person];
		for(int i=0;i<person;i++)
		{
			System.out.println("\nPerson "+(i+1)+":");
			Calculate.calculating();
			EarthWeight[i]=Calculate.weight;
			MarsWeight[i]=Calculate.finalweight;
			System.out.println("");
		}
		System.out.print("\nStore List Here");
		for(int i=0;i<person;i++)
		{
			System.out.println("\nPerson "+(i+1)+" Weight On Earth Is " + EarthWeight[i]+" Kilogram");
			System.out.print("Person "+(i+1)+" Weight On Mars Is ");
		    System.out.printf("%.2f", MarsWeight[i]);
		    System.out.print(" Kilogram\n");
		}
	}
}
