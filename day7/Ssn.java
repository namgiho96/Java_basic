package day7;
import java.util.Scanner;
public class Ssn {
	public void gender(){
		Scanner scan = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���!");
		String a = scan.next();
		char ch = a.charAt(7);
		String gen = "";
		
		switch(ch){
		case '1': gen = "����"; break;
		case '2': gen = "���� "; break;
		case '3': gen = "����"; break;
		case '4': gen = "���� "; break;
		case '5': gen = "�ܱ���"; break;
		case '6': gen = "�ܱ���"; break;
		default : gen = "�߸��Է��ϼ˽��ϴ�"; break;
		
		
		
		}
		System.out.println("����"+gen);
	}
}
