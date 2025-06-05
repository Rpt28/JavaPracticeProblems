package Numbers_Arrays;

public class P7FirstSecondHighest {

	public static void main(String[] args) {
		int A[] = { 1, 20, 30, 2, 80, 90, 11, 111, 2019, 3, 4, 5, 50, 70, 60 };
		int i = 0, j = 0, Firsthigh = A[0], Sechigh = A[1];
		for (i = 0; i < A.length; i++) {
			if (A[i] >= Firsthigh) {
				Firsthigh = A[i];
			}
			for (j = 0; j < A.length; j++) {
				if (A[j] < Firsthigh && A[j] >= Sechigh) {
					Sechigh = A[j];
				}
			}
		}
		System.out.println("First highest value is : " + Firsthigh);
		System.out.println("Second highest value is : " + Sechigh);
	}
}
