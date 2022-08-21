package PraveenSir;
import java.util.Arrays;
public class CheckArray {
public static void main(String[] args) {
	int[]arr= {1,2,3,3,4,5,6,7};
	int arr1[]= {1,2,3,3,4,5,6,7};
	//boolean status=Arrays.equals(arr,arr1);
	System.out.println(Arrays.binarySearch(arr, 1));
	System.out.println(Arrays.equals(arr,arr1));
	System.out.println(Arrays.binarySearch(arr1, 3));
	
	String string=Arrays.toString(arr1);
	System.out.println(string);
	
	
	
	
	
}
}
