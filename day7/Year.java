package day7;
import java.util.Scanner;
public class Year {
		public void yearclac(){
			Scanner scan = new Scanner(System.in);
			System.out.println("년도를 입력하세요");
			int year = scan.nextInt();
			
			String year2 = "";
			
			int a = year%4;
			int b = year%100;
			int c= year%400;
			
			if(c==0&&a!=0||b==0){
				year2 = "윤년";
			}else{
				year2 = "평년";
			}
			System.out.print(year+year2);
			
		}

}
