package day3;

import java.util.Scanner;

public class Gender {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("주민등록번호를 입력하세요");
	String num = scan.next();
	char ch = num.charAt(7);
	String res = "";
	switch(ch){
	case '1': res = "남자"; break;
	case '2': res = "여자"; break;
	case '3': res = "남자"; break;
	case '4': res = "여자"; break;
	case '5': res = "외국인"; break;
	case '6': res = "외국인"; break;
	
	default : res = "잘못입력했습니다"; break;
	}
	System.out.printf("%s",res);

}
}