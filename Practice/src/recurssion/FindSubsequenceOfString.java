package recurssion;

public class FindSubsequenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abc";
		subsequence(str,0,"");
	}
	public static void subsequence(String str,int indx,String newStr) {
		if(indx==str.length()) {
			System.out.println(newStr);
			return;
		}
		char currChar=str.charAt(indx);
		
		//element will be there
		subsequence(str,indx+1,newStr+currChar);
		
		//element will not be there
		subsequence(str,indx+1,newStr);
	}
}
