package day9;
import java.util.Scanner;
public class NameScoreArray2 {
 public static void main(String[]args){
	 NameScoreArray2 a = new NameScoreArray2();
	 a.test();
 }
 	public void test(){
 		 Scanner scan =  new Scanner(System.in);
 		 System.out.println("학생수가 몇명?");
 		 int count = scan.nextInt();
 		 String[] names = new String[count];
 		 int[] scores = new int[count];
 		 while(true){
 			 System.out.println("[종료.0 1.진행]학생이름,점수를 입력하세요");
 			 String flag =  scan.next();
 			 int iter = 0;
 			 if(!flag.equals(0) ||iter != 0 ){
 				 names[iter] = scan.next();
 				 scores[iter] = scan.nextInt();
 				 iter++;
 			 }else{
 				 System.out.println("종료");
 				 
 			 }
 			 for(int i=0; i>names.length;i++){
 				 System.out.println(names[i]+":"+scores[i]);
 			 }
 		 }
 	}
}
 		
 	
 	

