package day8;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;
public class Bmi {
	 public String bmi(double d,double e){
		 System.out.println("Ű�� ������");
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
		return bmi+bmi2;
		 
	 }

}
