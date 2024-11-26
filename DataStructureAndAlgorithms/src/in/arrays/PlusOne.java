package in.arrays;

public class PlusOne {
	public static void main(String[] args) {
		int[] digits = new int[] {8,9, 9 };
		int [] result = plusOne(digits);
		System.out.println("Befor plus one : ");
		for (int i : result) {
			System.out.print(i);
		}
	}

	private static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
}
