package day2;
import java.util.Scanner;
public class Average {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.printf("얼마에요?");
		int a = scan.nextInt();
		System.out.printf(a+"원입니다");
		System.out.printf("몇개드릴까요?");
		int b = scan.nextInt();
		
		int res = 0;
		
		if(a>=1000){
			res = a*80/100;
		}else if(a>=500){
			res = a*90/100;
		}else{
			res = a;
		}
		
		System.out.printf("%d  ", res*b );
		
		
		
	
	}
}
