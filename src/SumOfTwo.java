
public class SumOfTwo {

	public static void main(String[] args) {
		
		int sum = 10;
		int[] numbers  = {3,5};
		System.out.println(sumChecker(sum, numbers));	
	}

	private static boolean sumChecker(int sum, int[] numbers) {
		for(int i = 0; i < numbers.length ; i++) {
			for(int j = 1; j < numbers.length ; j++) {
				if(i+j == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
}
