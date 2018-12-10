package day7;
import java.util.Scanner;
public class Ssn {
	public void gender(){
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요!");
		String a = scan.next();
		char ch = a.charAt(7);
		String gen = "";
		
		switch(ch){
		case '1': gen = "남자"; break;
		case '2': gen = "여자 "; break;
		case '3': gen = "남자"; break;
		case '4': gen = "여자 "; break;
		case '5': gen = "외국인"; break;
		case '6': gen = "외국인"; break;
		default : gen = "잘못입력하셧습니다"; break;
		
		
		
		}
		System.out.println("성별"+gen);
	}
}
