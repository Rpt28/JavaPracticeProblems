package numbers;

import java.util.Arrays;

public class P11MissingNumber {

	public static void main(String[] args) {
		int array[] = { 0, 8, 2,24,8,2,67,23,43,12, 1, 6, 4, 5 };
		int i, counter = 0;
		Arrays.sort(array);
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		for (i = array[0]; i <= array[array.length - 1]; i++) {
			if (array[counter] == i) {
				counter++;
			} else
				System.out.println("Missing number is : " + i);
		}
	}

}
