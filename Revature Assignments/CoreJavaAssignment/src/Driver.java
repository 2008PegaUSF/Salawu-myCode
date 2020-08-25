import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		Q1 bs = new Q1();
		bs.Sorts();
		
		
		Q2 fn = new Q2();
		fn.Fibo();
		
		
		Q3 re = new Q3();
		re.Reverse();
		
		
		/*Q4 fac = new Q4();
		fac.Factorial();*/
		
		
		Q5 sb = new Q5();
		sb.Subs();
		
		Q6 even = new Q6();
		Q6.num();
		
		compare emp = new compare(null, null, 0);
		ArrayList<compare> ar = new ArrayList<compare>();
		ar.add(new compare("Sam Little.3", "English", 27));
		ar.add(new compare("John Middle", "Chemistry", 30));
		
		System.out.println("UnSorted");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar, new Sortbyage());
	}
}
