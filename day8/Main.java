package day8;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //메소드 엔트리포인트 진입점
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("[종료]"
					+ "1.계산기\n"
					+ "2.BMI\n"
					+ "3.달력\n"
					+ "4.성별 판별기\n"
					+ "5.성적표\n");
			String se = scan.next();
			
				switch(se){			
					case "0":System.out.println("종료!"); return;
					case "1":
						Calc calc = new Calc();	
						calc.calc();
						break;										
					case "2":
						Bmi bmi = new Bmi();
						bmi.bmi();
						break;
					case "3":
						MyCalendar calendar = new MyCalendar();
						break;
					case "4":
						GenderChack chack = new GenderChack();
						break;
					case "5":
						Year grade =  new Year();
						break;
					default: break;			
				}
		}
	}

}
