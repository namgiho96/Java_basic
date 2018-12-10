package day8;
import java.util.Scanner;
public class MyCalendar {
		public void  Runnable() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("년도를 입력하세요");
		 int year = scan.nextInt();
		 String a =  "";
		 
		 int b = year%100;
		 int c = year%400;
		 int d = year%4;
		 
		 if(b==0||c==0||d==0){
			 a = "윤년 ";
		 }else
			 a = "평년";
		 }
		
		}	
		
}
