package day8;


public class NameArray {
	public void test(){
		
		String[] name =  {"ȫ�浿","�念��","������"};
		String res = "";
		
		for(int i=0;i<3;i++){
			if(i<2){
				
				res += name[i]+ ",";
			}else {
				res += name[i]+ "";
				
			}
			System.out.println(res);
		}
	}

		public static void main(String[]agrs){
			NameArray a = new NameArray();
			a.test();
		}
}


