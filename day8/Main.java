package day8;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //�޼ҵ� ��Ʈ������Ʈ ������
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("[����]"
					+ "1.����\n"
					+ "2.BMI\n"
					+ "3.�޷�\n"
					+ "4.���� �Ǻ���\n"
					+ "5.����ǥ\n");
			String se = scan.next();
			
				switch(se){			
					case "0":System.out.println("����!"); return;
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
