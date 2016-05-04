public class TestJava {

	public static void main(String[] args) {
		final int arraySize = 100000000;
		int[] array = new int[arraySize];

		for (int i = 0 ; i < arraySize ; i++) {
			array[i] = i + 1;
		}

		final long startTime = System.currentTimeMillis();
		reverseArray(array);
		final long endTime = System.currentTimeMillis();

		System.out.print("Array Reverse Time: " + (endTime - startTime) + "ms");
	}

	private static void reverseArray(int[] array){
		for (int i = 0 ; i < array.length / 2 ; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}


}