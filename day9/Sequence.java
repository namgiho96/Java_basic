package day9;
public class Sequence {
	public  String sequenceTest(int num,int sum){
		String res ="";
		for(int i=0; i<num+1; i++){
			if(i==0){
		 
			}else{
				if(i<num&&i!=0){
					res += i+"+";
				}else{
					res += i+"=";
				}
			}
			sum += i;
		}
		return res+sum;
		
	}
	}
