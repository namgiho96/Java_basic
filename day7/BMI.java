package day7;
import java.util.Scanner;
public class BMI {
	public void  Bmiclac() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������");
		double w = scan.nextDouble();
		System.out.println("Ű");
		double h = scan.nextDouble();
		
		double bmi = w/((h*h)/10000);
		String bmi2 = "";
		
		if(bmi>=40){
			bmi2 = "����";
		}else if (bmi>=35){
			bmi2 = "�ߵ ��";
		}else if (bmi>=30){
			bmi2 = "�浵 ��";
		}else if(bmi>=25){
			bmi2 = "��ü��";
		}else if(bmi>=18.5){
			bmi2 = "����";
		}else{
			bmi2 = "��ü��";
		}
				System.out.println("BMI:"+bmi+bmi2);
	}
}
