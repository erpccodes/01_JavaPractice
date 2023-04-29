package recurssion;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println(factorialNumber(num));	
		
	}
	
	public static int factorialNumber(int num) {
		if(num==1 || num == 0)
			return 1;
		int fact=num * factorialNumber(num-1);
		return fact;
	}

}
