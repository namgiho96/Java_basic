package day8;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;
public class Bmi {
	 public void bmi(){
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("몸무게");
		 double d = scanner.nextDouble();
		 System.out.println("키");
		 double e = scanner.nextDouble();
		 
		 double bmi =d/((e*e)/10000);
		 String bmi2 = "";
		 
		 if(bmi>=40){
			 bmi2 = "고도비만";
		 }else if(bmi>=35){
			 bmi2 = "중등도 비만";
		 }else if(bmi>=30){
			 bmi2 = "경도 비만";			 
		 }else if(bmi>=25){
			 bmi2 = "정상";			 
		 }else if(bmi>=18.5){
			 bmi2 = "저체중";	 
		 }else{
			 bmi2 = "저체중";
			 
		 }
		 System.out.println("BMI"+bmi+bmi2);
	 }

}
