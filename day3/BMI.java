package day3;
import java.util.Scanner;
public class BMI {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("몸무게");
		double w = scan.nextDouble();
		System.out.println("키");
		double h = scan.nextDouble();
		
		double bmi = w/((h*h)/10000);
		String bmi2 = "";
		
		if(bmi>=40){
			bmi2 = "고도비만";
		}else if (bmi>=35){
			bmi2 = "중등도 비만";
		}else if (bmi>=30){
			bmi2 = "경도 비만";
		}else if(bmi>=25){
			bmi2 = "과체중";
		}else if(bmi>=18.5){
			bmi2 = "정상";
		}else{
			bmi2 = "저체중";
		}
				System.out.printf("BMI"+"%f,%s",bmi,bmi2);
	}
}

