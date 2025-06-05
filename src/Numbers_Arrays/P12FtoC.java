package Numbers_Arrays;
import java.util.*;
public class P12FtoC {

	public static void main(String[] args) {
		float T;
		Scanner in=new Scanner(System.in);
		System.out.println("enter temp in F ");
		T=in.nextInt();
		T=((T-32)*5)/9;
		System.out.println("temp in C is "+T);

	}

}
