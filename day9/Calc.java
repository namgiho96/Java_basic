package day9;
public class Calc {
	public String calctest(int num,String op,int num1){
	{		
		int res = 0;
		switch(op){
		case "+": res = num + num1;	break;
		case "-": res = num - num1;	break;
		case "*": res = num * num1;	break;
		case "/": res = num % num1;	break;
		case "%": res = num / num1;	break;
		}
		return ""+res;
	}
}
}