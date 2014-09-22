/* Justin Mercado
 * Quiz 1
 */

import java.util.Scanner;

public class PasserRating {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of passing attempts: ");
		double ATT = input.nextDouble();
		
		System.out.print("Number of completions: ");
		double COMP = input.nextDouble();
		
		System.out.print("Passing yards: ");
		double YDS = input.nextDouble();
		
		System.out.print("Number of touchdown passes: ");
		double TD = input.nextDouble();
		
		System.out.print("Number of interceptions: ");
		double INT = input.nextDouble();
		
		// Formula: Passer Rating= (a+b+c+d/6) * 100
		
		double a = ((COMP/ATT) - .3) * 5;
		double b = ((YDS/ATT) - 3) * .25;
		double c = (TD/ATT) * 20;
		double d= 2.375 - ((INT/ATT) * 25);
		
		double PR = ((a+b+c+d)/6) * 100;
		
		System.out.printf("QB Rating is: ");
		System.out.printf("%.1f", PR);
		input.close();
	}

}
