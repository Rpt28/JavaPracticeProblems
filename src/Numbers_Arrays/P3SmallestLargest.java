package Numbers_Arrays;

public class P3SmallestLargest {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 123, 10, 20, 15, 12, 11, 13, 80, 111, 20 };
		int i, temp;
		for (i = 0; i < numbers.length-1; i++) {
			if (numbers[i] >= numbers[i + 1]) {
				temp = numbers[i];
				numbers[i] = numbers[i + 1];
				numbers[i + 1] = temp;
			}
		}
		System.out.println("Smallest number is = " + numbers[0]);
		System.out.println("Largest number is = " + numbers[numbers.length - 1]);
		System.out.print("Sorted array is = ");
		for (i = 0; i < numbers.length - 1; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}