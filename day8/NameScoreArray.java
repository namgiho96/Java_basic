package day8;
import java.util.Scanner;
public class NameScoreArray {
	public void test(){
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 3 입력");
		int[] score =  new int[3];
		String res = "";
		
	for(int i=0;i<score.length;i++){		
			score[i] = scan.nextInt();
	}
	for(int i=0;i<score.length;i++){
		if(i<score.length-1){
			res = score[i]+",";
		}else{
			res = score[i]+"";
			}
		System.out.println(res);
	}
		
	}

	public static void main(String[]args){
		NameScoreArray a = new NameScoreArray();
		a.test();
}


		}
	
