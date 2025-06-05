package basic;

public class EnhanceForLoop {

	public static void main(String[] args) {
		String[] cityname = {"delhi", "mumbai", "chennai", "kolkatta"};
		int[] age = {1,2,3};
		
		for(String name : cityname) {
			System.out.println(name);
		}
		for (int ages : age) {
			System.out.println(ages);
		}
	}

}
