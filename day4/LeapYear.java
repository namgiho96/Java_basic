package day4;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scan.nextInt();
		String res = "";
		if( (year%4==0 && year%100!=0) || year%400==0 ){
			res = "윤년";
		}else{
			res = "평년";
		}
	}
}
