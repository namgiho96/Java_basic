package day8;
import java.util.Scanner;


	public class ScoreArray {
		public void test(){			
			Scanner scan = new Scanner(System.in);
			System.out.println("Á¡¼ö");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			int arr[] = {a,b,c};
			String res ="";
			
			for(int i=0;i<arr.length;i++){
				if(i < arr.length-1){
				res += arr[i]+",";
				}else{
				res += arr[i]+"";
				}
			}
			System.out.println(res);
		}
		public static void main(String[]args){
			ScoreArray sc = new ScoreArray();
			sc.test();
		}
	}
