package day2;
import java.util.Scanner;
public class Grade {
	public static void main(String[]args){
		Scanner scan =  new Scanner(System.in);
		System.out.println("ȫ���");
		System.out.println("����");
		double num = scan.nextDouble();
		System.out.println("����");
		double num1 = scan.nextDouble();
		System.out.println("����");
		double num2 = scan.nextDouble();
		System.out.println("����");
		double num3 = scan.nextDouble();
		System.out.println("��ȸ");
		double num4 = scan.nextDouble();
		
		double all =num1+num2+num3+num4+num;
		double res = all/5;
		String res2 ="";
		if(res>=90){
			res2 = "A";
		}else if(res>=80){
			res2 = "b";
		}else {
			res2 = "F";
		}
		System.out.println("ȫ�浿"+all+"��"+"���"+res+"����"+res2);
	}
}
