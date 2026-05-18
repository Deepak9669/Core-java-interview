package string;

public class TypeCasting {

	public static void main(String[] args) {

//		Integer To String

		int n = 100;
		String s = Integer.toString(n);
		System.out.println(s);

		String s1 = String.valueOf(n);
		System.out.println(s1);

//		String To Integer		

		String s2 = "200";
		Integer i = Integer.valueOf(s2);
		System.out.println(i);

		Integer i1 = Integer.parseInt(s2);
		System.out.println(i1);

	}

}
