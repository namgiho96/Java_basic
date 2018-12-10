package day3;
import java.util.Scanner;
public class BMI {
	public static void main(String[]args){
		Scanner scan =  new Scanner(System.in);
		System.out.println("¸ö¹«°Ô:");
		int w = scan.nextInt();
		System.out.println("Å°");
		int h = scan.nextInt();
		
		int bmi = w/((h*h/10000));
		String bmi2 = "";
	}
}
