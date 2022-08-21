package PraveenSir;
import java.util.Arrays;
import java.util.Collections;
public class SortUsingBuiltInMethods {
public static void main(String[] args) {
	int arr[]= {22,55,88,66,11,44,55,66,88,55};
	System.out.println("array before sorting "+Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println("arrays after sorting "+Arrays.toString(arr));
	// aproach 2
	int arr1[]= {22,55,88,66,55,11,44,55,66,88,55};
	Arrays.parallelSort(arr1);
	System.out.println("array after sorting "+Arrays.toString(arr1));
	//sort in decsending order
	Integer arr2[]= {22,55,66,88,99,33,22,55,44,88,99};
	Arrays.sort(arr2,Collections.reverseOrder());
	System.out.println(" ");
}
}
