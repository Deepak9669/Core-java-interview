package exception;

public class TestStringIndexOutOfBound {

	public static void main(String[] args) {

		String s = "Mohit";
		String a[] = { "a", "b" };

		try {

//			System.out.println(10 / 0);
//			System.out.println(a[4]);
			System.out.println(s.charAt(6));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);

		} finally {

			System.out.println("Final");
		}

	}
}