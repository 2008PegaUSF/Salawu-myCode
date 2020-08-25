import java.util.Scanner;

public class Q4 {

	public void Factorial() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\nPlease enter below the integer from which you want to calculate factorial");
		
		int N = sc.nextInt();
		
		int fact = 1;
		
		for (int i = 1; i <= N; i++) {
			fact = fact*i;
			//was initially thinking of ways to only show the end factorial rather than the whole processes; maybe an if statement somehow?
			System.out.println("\n\nThe Factorial of "+i+" is- "+fact);
		}
	}
}
