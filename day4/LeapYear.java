package day4;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		int year = scan.nextInt();
		String res = "";
		if( (year%4==0 && year%100!=0) || year%400==0 ){
			res = "����";
		}else{
			res = "���";
		}
	}
}
