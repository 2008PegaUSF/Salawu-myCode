
public class Q2 {

	public void Fibo() {
		
		System.out.println("\n\nBelow are Fibonacci Numbers response from Q2- ");
		int n1 = 0, n2 = 1, n3,i, count = 25;
		System.out.println(n1);
		
		
		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
