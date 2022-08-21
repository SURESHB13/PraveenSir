package PraveenSir;

public class SureshNew {
	static void toString(int n) {
		switch (n) {
		case 1:
			System.out.println("one");

			break;
		case 2:
			System.out.println("two");

			break;
		case 3:
			System.out.println("three");

			break;
		case 4:
			System.out.println("");

			break;
		case 5:
			System.out.println("five");

			break;
		case 6:
			System.out.println("six");

			break;
		case 7:
			System.out.println("seven");

			break;
		case 8:
			System.out.println("eight");

			break;
		case 9:
			System.out.println("nine");

			break;
		case 0:
			System.out.println("one");

			break;

		default:
			System.out.println("not a int value");
			break;
		}

	}

	public static void main(String[] args) {

		String[] stringArray = "12345678".split("");
		for (String string : stringArray) {
			// System.out.println(string);
			System.out.println(Integer.valueOf(string));
		}

	}

}
