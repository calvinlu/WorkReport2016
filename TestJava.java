
public class TestJava {

	public static void main(String[] args) {
		final int arraySize = 1000000;
		int[] array = new int[arraySize];

		final long startTime = System.currentTimeMillis();

		for (int i = 0 ; i < arraySize ; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}

		final long endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime);

	}
	
}