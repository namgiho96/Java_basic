package day8;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;
public class Bmi {
	 public void bmi(){
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("������");
		 double d = scanner.nextDouble();
		 System.out.println("Ű");
		 double e = scanner.nextDouble();
		 
		 double bmi =d/((e*e)/10000);
		 String bmi2 = "";
		 
		 if(bmi>=40){
			 bmi2 = "����";
		 }else if(bmi>=35){
			 bmi2 = "�ߵ ��";
		 }else if(bmi>=30){
			 bmi2 = "�浵 ��";			 
		 }else if(bmi>=25){
			 bmi2 = "����";			 
		 }else if(bmi>=18.5){
			 bmi2 = "��ü��";	 
		 }else{
			 bmi2 = "��ü��";
			 
		 }
		 System.out.println("BMI"+bmi+bmi2);
	 }

}
