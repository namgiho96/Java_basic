package day9;

import java.util.Scanner;

public class GenderChecker {
	public void genderCheckerTest(){
	
	Scanner scan = new Scanner(System.in);
	System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���");
	String num = scan.next();
	char ch = num.charAt(7);
	String res = "";
	switch(ch){
	case '1': res = "����"; break;
	case '2': res = "����"; break;
	case '3': res = "����"; break;
	case '4': res = "����"; break;
	case '5': res = "�ܱ���"; break;
	case '6': res = "�ܱ���"; break;
	
	default : res = "�߸��Է��߽��ϴ�"; break;
	}
	System.out.println(res);
}
}