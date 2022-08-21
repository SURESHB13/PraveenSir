package PraveenSir;

public class MaximumAndMinimum {public static void main(String[] args) {
	int arr[]= {22,23,5,88,99,55,66,44,55,88,666,33,22,5599999};
	int max=arr[0];
	int min=arr[0];
	for (int i : arr) {
		if (max<i) {max=i;
			
		}
		
	}for (int i : arr) {
		if (min>i) {min=i;
			
		}
		
	}
	System.out.println(max);
	System.out.println(min);
	
	
}

}
