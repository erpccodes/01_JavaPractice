package binarySearch;

/** Given a sorted array and a value x, the ceiling of x is the smallest element 
in an array greater than or equal to x, and the floor is the greatest element smaller
than or equal to x*/

/** Q-> https://www.codingninjas.com/codestudio/problems/ceiling-in-a-sorted-array_1825401?leftPanelTab=0*/

public class CeilingNumber {

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,6};
		System.out.println(findCeilingNumber(arr,21));
		}

	public static int findCeilingNumber(int[] arr, int target) {
		int f=0;
		int l=arr.length-1;
		
		while(f<l)
		{
			int mid=f+(l-f)/2;
			if(arr[mid]==target)
				return arr[mid];
			else if(arr[mid]<target)
				f=mid+1;
			else
				l=mid-1;
		}
		if(arr[f]<target)  //if the target is greater than all the elements in an array
			return -1;
		return arr[f];
		
	}
}
