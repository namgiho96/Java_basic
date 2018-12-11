package day8;
import java.util.Scanner;
public class Calc {
	public String calc(int i,String op,int j){
		Scanner scanner = new Scanner(System.in);
		System.out.println("°è»ê±â");
		
		
		int res2 = 0;
		
		switch (op) {
		case "+": res2 =  i + j;	break;
		case "-": res2 =  i - j;	break;
		case "*": res2 =  i * j;	break;
		case "/": res2 =  i / j;	break;
		case "%": res2 =  i % j;	break;
								
			
		
		}
			return ""+res2;
	}
	
}
