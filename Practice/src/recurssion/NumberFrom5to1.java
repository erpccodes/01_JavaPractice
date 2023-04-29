package recurssion;

// Print numbers from n to 1

public class NumberFrom5to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		printNum(5);
	}
	
	public static void printNum(int n) {
		if(n==0)
			return;
		System.out.println(n);
		 printNum(n-1);
	}

}
