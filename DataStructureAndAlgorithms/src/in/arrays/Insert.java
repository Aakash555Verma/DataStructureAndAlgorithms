package in.arrays;

import java.util.Arrays;

public class Insert {

	public static void insert2() {

		/**
		 * Time Complexity = O(n)
		 * 
		 * This loop shifts the elements to make space for the new element. The loop
		 * runs from size - 1 to positionToInsert, which means it iterates (size -
		 * positionToInsert) times. In the worst case, it could iterate size times (when
		 * positionToInsert = 0), which is O(n) where n is the size of the array. Time
		 * Complexity: O(n), where n is the size of the array (size).
		 * 
		 * The insertion of the element input[positionToInsert] = elementToInsert
		 * happens in constant time. Time Complexity: O(1), Therefore overall Time
		 * Complexity = O(n).
		 * 
		 * 1) Worst Case TC = O(n), If positionToInsert = 0. In this case loop run for
		 * entire array.
		 * 
		 * 2) Best Case TC = O(1), If positionToInsert = size.In this case loop runs
		 * exactly one time.
		 * 
		 * Space Complexity = O(1)
		 * 
		 * The array doesn't grow dynamically, and no additional space is allocated
		 * during the operation. A few integer variables (capacity, size,
		 * elementToInsert, positionToInsert) are used, which consume constant space.
		 * 
		 **/
		int capacity = 6, size = 5;
		int input[] = new int[capacity];
		int elementToInsert = 8, positionToInsert = 3;

		input[0] = 0;
		input[1] = 1;
		input[2] = 2;
		input[3] = 3;
		input[4] = 4;

		if (capacity == size) {
			System.err.println(
					"We cannot insert because array capacity is full, need to create new array with size = current array size + 1");
			return;
		}

		if (positionToInsert >= capacity) {
			System.err.println(
					"We cannot insert because array capacity is less that the position where we want to insert element");
			return;
		}

		System.out.println("Input array before insertion : " + Arrays.toString(input) + " having length : "
				+ input.length + " elementToInsert value : " + elementToInsert + " at position : " + positionToInsert);

		for (int i = size - 1; i >= positionToInsert; i--)
			input[i + 1] = input[i];

		input[positionToInsert] = elementToInsert;

		System.out.println("After insertion resulting array : " + Arrays.toString(input));
	}
	
	static int insert(int arr[], int n, int x, int cap, int pos) {
		if (n == cap)
			return n; // Now we cannot insert.

		int idx = pos - 1;

		for (int i = n - 1; i >= idx; i--) {
			arr[i + 1] = arr[i];
		}

		arr[idx] = x;

		return n + 1;
	}

	public static void main(String args[]) {
		int arr[] = new int[5], cap = 5, n = 3, size = arr.length;

		// n is number of elements and cap is size of array.

		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 20;

		System.out.println("Before Insertion : " + Arrays.toString(arr));

		int x = 7, pos = 2;

		n = insert(arr, n, x, cap, pos);

		System.out.println("After Insertion : " + Arrays.toString(arr) + " \n");

		insert2();
	}

}
