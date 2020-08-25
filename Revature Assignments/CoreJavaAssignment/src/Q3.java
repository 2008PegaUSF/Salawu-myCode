
public class Q3 {

	public void Reverse() {
		String Reverse = "Reverse String";
				
		for (int i = 0; i < Reverse.length(); i++) {
			Reverse = Reverse.substring(1, Reverse.length() - i)+ Reverse.charAt(0) + Reverse.substring(Reverse.length() - i);
		}
			System.out.println("\n\nThis is the Reverse String in Q4 without any temp var- "+Reverse);
		
	}
}
