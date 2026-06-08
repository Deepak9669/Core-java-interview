package collecton;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {

//		ab

		String str = "Ram";

		String s = new String(str);

		System.out.println(s);


//		ub

		String str1 = new String("Shyam");

		String s1 = str1;

		System.out.println(s1);
	}
}
