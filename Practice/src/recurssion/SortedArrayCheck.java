package recurssion;
//Check if array is sorted, String increasing
public class SortedArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,6,7,8};
		checkSorted(arr,0);
	}
	public static void checkSorted(int[] arr,int i) {
		if(i==arr.length-1) {
			System.out.println("array is sorted");
			return;
		}
		if(arr[i]>=arr[i+1]) {
			System.out.println("array is not Sorted");
			return;
		}
		checkSorted(arr, i+1);
	}
}
