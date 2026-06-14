package streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {

		String str[] = { "abcz", "def", "jkl", "ghi" };

		Stream stream = Arrays.stream(str);

		stream.forEach(System.out::println);

	}
}
