package recurssion;
// finonacci series till nth number
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int n=20;
		System.out.println(a);
		fibonacciPrint(a,b,n);
	}
	
	public static void fibonacciPrint(int a,int b,int n) {
		int c= a+b;
		if(c>n)
			return;
		System.out.println(c);
		fibonacciPrint(b,c,n);
		
	}

}
