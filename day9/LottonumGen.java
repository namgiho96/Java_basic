package day9;

import java.util.Random;

public class LottonumGen {
	public void test(){
			Random random = new Random();
			int[] lotto = new int[6];
			
			for(int i=0;i<lotto.length;i++){
				lotto[i] = random.nextInt(46);
				System.out.print(lotto[i]+",");
			}
	}					

	public static void main(String[]args){
		LottonumGen gen = new LottonumGen();
		gen.test();
	}

}