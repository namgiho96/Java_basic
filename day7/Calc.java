package day7;
import java.util.Scanner;
public class Calc {
	public void four(){
		Scanner scan = new Scanner(System.in);
		System.out.println("°è»ê±â");
		int num1 = scan.nextInt();
		String op = scan.next();
		int num2 = scan.nextInt();
		
		int ruselt = 0;
		
		switch(op){
		case "+" : ruselt = num1 + num2; break;
		case "-" : ruselt = num1 + num2; break;
		case "*" : ruselt = num1 + num2; break;
		case "/" : ruselt = num1 + num2; break;
		case "%" : ruselt = num1 + num2; break;
		
		}
		System.out.println(ruselt);
	}
}
