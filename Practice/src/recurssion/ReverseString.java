package recurssion;

/** Reversing a String using recurssion*/

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Pallindrome";
		String st="";
		int size = str.length();
		reverseString(str,size-1);
		System.out.println(reverseAndStore(str,size-1,st));
	}

	public static void reverseString(String str, int i) {
		if(i<0)
			return;
		System.out.print(str.charAt(i));
		reverseString(str,i-1);
	};
	
	public static String reverseAndStore(String str, int i, String st) {
		if(i<0) { 
			return st;}
		st=st+String.valueOf(str.charAt(i));
		return reverseAndStore(str, i-1,st);
		
		
	}
}
