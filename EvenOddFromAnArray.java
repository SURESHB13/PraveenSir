package PraveenSir;

public class EvenOddFromAnArray {public static void main(String[] args) {
	int []arr= {1,2,3,4,5,6,7,8,9,10,25,25,26,27,29};
int evenNumber=0;
int oddNumber=0;

for (int i = 0; i <arr.length; i++) {
	if (arr[i]%2==0) {evenNumber++;
		
	}
	if (arr[i]%2!=0) {oddNumber++;
		
	}
}System.out.println(evenNumber);
System.out.println(oddNumber);

}

}
