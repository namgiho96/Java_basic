package day2;
import java.util.Scanner;
public class Average {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.printf("�󸶿���?");
		int a = scan.nextInt();
		System.out.printf(a+"���Դϴ�");
		System.out.printf("��帱���?");
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
