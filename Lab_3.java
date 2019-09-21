import java.util.Scanner;

public class Lab_3 {
	public static void main (String[] args) {
		Scanner feet = new Scanner (System.in);
		System.out.println("Feet: ");
		int inches_1 = feet.nextInt(); 
		int feet_inches= inches_1* 12;

		Scanner inches = new Scanner(System.in);
		System.out.println("Inches: ");
		int inches_2 = inches.nextInt();
		double centimeters= (feet_inches+inches_2)*2.54;

		System.out.println(" Your height in centimeters is: "+centimeters+"cm");
	}
}