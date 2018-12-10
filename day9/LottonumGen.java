package day9;

import java.util.Random;

public class LottonumGen {
	public void test(){
			Random random = new Random();
			int[] lotto = new int[6];
			String name = "";
			for(int i=0; i< lotto.length;i++){
				if(i<lotto.length-1){
					lotto[i] = (int) (Math.random()*45);
					name += lotto[i]+",";
					
				}else{
					
					name += lotto[i];
				}
				System.out.print(lotto[i]);
					
			}
			
			
			
		
			
			
			
		}
	public static void main(String[]args){
		LottonumGen gen = new LottonumGen();
		gen.test();
	}
}
