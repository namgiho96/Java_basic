package day10;
import day9.*;
import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("0종료 1.BMI 2.계산기3.Sequence 4.성병 판별기 5.");
			switch(scan.next()){
			case "0": return;
			case "1":
				Bmi a = new Bmi();
				System.out.println("키와 몸무게를 입력하세요");
				System.out.println(a.BmiTest(scan.nextDouble(),scan.nextDouble()));
					break;
			case "2":
				Calc b = new Calc();
				System.out.println("숫자,연산,숫자");
				System.out.println(b.calctest(scan.nextInt(),scan.next(),scan.nextInt()));
				break;
			case "3":
				Sequence c = new Sequence();
				System.out.println("숫자를 입력하세요");
				System.out.println(c.sequenceTest(scan.nextInt()));
					
					break;
				case"4":
					
					break;
				case"5":
					break;
				case"6":
					break;
			}
			
		}
	}
}
