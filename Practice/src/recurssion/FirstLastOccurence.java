package recurssion;

public class FirstLastOccurence {
	
	static int first=-1,last=-1;

	public static void main(String[] args) {
		
		String str="sasdbajsblhjaajkd";
		char element='a';
		findFirstLast(str,0,element);
	}

	public static void findFirstLast(String str,int indx,char element) {
		if(indx==str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		if(str.charAt(indx)==element) {
			if(first==-1)
				first=indx;
			last=indx;
		}
		findFirstLast(str, indx+1, element);
	}
}
