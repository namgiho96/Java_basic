package day10;
import day9.*;
import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("0���� 1.BMI 2.����3.Sequence 4.���� �Ǻ��� 5.");
			switch(scan.next()){
			case "0": return;
			case "1":
				Bmi a = new Bmi();
				System.out.println("Ű�� �����Ը� �Է��ϼ���");
				System.out.println(a.BmiTest(scan.nextDouble(),scan.nextDouble()));
					break;
			case "2":
				Calc b = new Calc();
				System.out.println("����,����,����");
				System.out.println(b.calctest(scan.nextInt(),scan.next(),scan.nextInt()));
				break;
			case "3":
				Sequence c = new Sequence();
				System.out.println("���ڸ� �Է��ϼ���");
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
