package day8;
import java.util.Scanner;
public class Calc {
	public void calc(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("°è»ê±â");
		int i = scanner.nextInt();
		String op = scanner.next();
		int j = scanner.nextInt();
		
		int res2 = 0 ;
		
		switch (op) {
		case "+": res2 =  i + j;	break;
		case "-": res2 =  i - j;	break;
		case "*": res2 =  i * j;	break;
		case "/": res2 =  i / j;	break;
		case "%": res2 =  i % j;	break;
								
			
		
		}
		System.out.println(res2);
	}
	
}
