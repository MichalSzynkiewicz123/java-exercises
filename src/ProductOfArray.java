
public class ProductOfArray {

	
	public static void main(String[] args) {
		
		int[] input = {1, 2, 3, 4, 5};
		
		
		
		int[] output = withoutDivide(input);
		System.out.println("Without division : ");
		for(int i = 0 ; i< output.length ; i++) {
			System.out.println(output[i]+",");
		}
		
		output = withDivide(input);
		System.out.println("With division : ");
		for(int i = 0 ; i< output.length ; i++) {
			System.out.println(output[i]+",");
		}
		
		

	}

	private static int[] withoutDivide(int[] input) {
		int[] output = new int[input.length ] ;
		for(int i = 0 ; i< output.length ; i++) {
			for(int j = 0 ; j< input.length ; j++) {
				if(input[j]!=input[i]) {
					if(output[i] == 0) {
						output[i] = input[j];
					}else {
						output[i] = output[i]*input[j];
					}
				}
			}
		}
		return output;
	}
	
	private static int[] withDivide(int[] input) {
		int[] output = new int[input.length ] ;
		for(int i = 0 ; i< output.length ; i++) {
			for(int j = 0 ; j< input.length ; j++) {
				if(output[i] == 0) {
					output[i] = input[j];
				}else {
					output[i] = output[i]*input[j];
				}
			}
			output[i] = output[i]/ input[i];
		}
		return output;
	}

}
