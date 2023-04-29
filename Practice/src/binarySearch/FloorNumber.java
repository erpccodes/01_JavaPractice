package binarySearch;

public class FloorNumber {

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,6};
		System.out.println(findCeilingNumber(arr,3));
		}

	public static int findCeilingNumber(int[] arr, int target) {
		int f=0;
		int l=arr.length-1;
		
		while(f<=l)
		{
			int mid=f+(l-f)/2;
			if(arr[mid]==target)
				return arr[mid];
			else if(arr[mid]<target)
				f=mid+1;
			else
				l=mid-1;
		}
		if(l<1) return -1; 	// If target is less than all elements in an array
		
		return arr[l];
		
	}
}
