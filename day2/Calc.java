package day2;
import java.util.Scanner;
public class Calc {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("����");
		int num = scan.nextInt();
		String op = scan.next();
		int num1 = scan.nextInt();
		
		int res = 0;
		
		switch(op){
		case "+": res = num + num1;	break;
		case "-": res = num - num1;	break;
		case "*": res = num * num1;	break;
		case "/": res = num % num1;	break;
		case "%": res = num / num1;	break;
		}
		System.out.printf("%d %s %d = %d",num ,op, num1, res);
	}
}
