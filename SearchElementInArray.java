package PraveenSir;

public class SearchElementInArray {
public static void main(String[] args) {
	int arr[]= {11,22,33,44,55,66,77};
	
	int key=111;
	boolean flag=false;
	for (int i : arr) {
		if (key==i) {flag=true;
			
		}
		
	}if (flag) {System.out.println("found element");
		
	}else {
		System.out.println("element not found");
	}
	
	
	
	
	
}
}
