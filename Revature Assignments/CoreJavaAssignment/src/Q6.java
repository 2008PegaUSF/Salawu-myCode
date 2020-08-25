
public class Q6 {

	public static boolean num() {
		int N = 5;
		
		boolean isEven = true;
		boolean isOdd = false;
		if (N > 0) {
			for (int i = 1; i <= N; i++) {
				isEven = !isEven;
				return isEven;
				
			}
			System.out.println("\n\n This number is Even");
			
				
		}
		else 
			System.out.println("\n\n This number is Odd");
		return isOdd;
	}
	
	
	
}
