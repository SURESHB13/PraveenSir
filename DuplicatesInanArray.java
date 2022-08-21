package PraveenSir;

import java.util.Iterator;

public class DuplicatesInanArray {
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,5,5,6,7,88,89,9,0};
		boolean flaag=false;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j]) {flaag=true;
					
				}
				}if (flaag) {System.out.println("found duplicate "+arr[i]);
				
				
			}
		}
	}

}
