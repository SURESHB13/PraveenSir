package PraveenSir;

import java.util.Arrays;
import java.util.Iterator;

public class Sort {public static void main(String[] args) {
	int []arr= {11,55,66,88,99,11,55,33,44,22,33};
	System.out.println("array before sorting "+Arrays.toString(arr));

	for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if (arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
			
		}
	}System.out.println("array after sorting"+Arrays.toString(arr));
	}}
	



