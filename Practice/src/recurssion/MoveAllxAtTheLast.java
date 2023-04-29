package recurssion;
// moving all x at the last of string
public class MoveAllxAtTheLast {

	 public static void main(String[] args) {
	        // Create a StringBuilder object to use for concatenation
	        StringBuilder sb = new StringBuilder();
	        String str="ToxtxalNuxmbxerOfXarxe:";
	        moveToLast(str,0,0,sb,'x');
	        System.out.println(sb.toString());
	    }

	    public static void moveToLast(String str,int i,int count,StringBuilder sb,char element) {
	        if(i==str.length()) {
	            sb.append(addXs(count, 0));
	            return;
	        }
	        if(str.charAt(i)==element) {
	            count++;
	        }else {
	            sb.append(str.charAt(i));
	        }
	        moveToLast(str,i+1,count,sb,element);
	    }

	    public static String addXs(int count,int i) {
	        StringBuilder sb = new StringBuilder();
	        while (i < count) {
	            sb.append('x');
	            i++;
	        }
	        return sb.toString();
	    }
	}

/** 
 
Why we are using StringBuilder instead of string
Java's String class is capable of concatenating long strings. 
However, concatenating strings using the "+" operator creates a new String object every time it is called.
This can cause performance issues when working with large strings or when concatenating strings repeatedly in a loop.

When working with long strings, it is recommended to use StringBuilder or StringBuffer classes 
to concatenate strings because they are mutable, which means that they can be modified without creating a new object every time.

*/