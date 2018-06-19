import java.util.ArrayList;
import java.util.List;

public class Stairs {

	public int how_many_ways( int stairs, int[] atOnceTaken) {
		if(stairs == 0) return 1;
		
		int[] numberOfWays = new int [stairs+1]; 
		numberOfWays[0] = 1;
		 for(int i = 1 ; i <= stairs ; i++) {
			 int total = 0;
			 	for(int j : atOnceTaken) {
			 		if(i - j >= 0){
			 			total += numberOfWays[i-j];
			 		}
			 	}
			 	numberOfWays[i] = total;
		 }
		
		
		return numberOfWays[stairs];
		
	}
	
	public static void main(String[] args) {
		int[] i = {1,3,5};
		int j = 3;
		
		Stairs s = new Stairs();
		
		System.out.println(s.how_many_ways(j, i));

	}

}
