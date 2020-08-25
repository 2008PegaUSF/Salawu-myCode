import java.util.Arrays;

public class Q1 {

	public void Sorts() {
		int[] a = new int[] {1,0,5,6,3,2,3,7,9,8,4};
		bubbleSort(a);
		
		/*used the Arrays.toString to print the array as a string for me to make sense of it otherwise
		 it comes back as a reference location, also had to import the java.util */
		System.out.println("This is bubble sort for the Q1 response- "+Arrays.toString(a));
		
	}
	//the array is called a
	public void bubbleSort(int[] a) {
		boolean sorted = false;
		int temp;
		/*used the while loop to continue if the array is not sorted, hence the !sorted*/
		while (!sorted) {
			sorted = true;
		/* used the for loop to loop until the if statement is no longer false*/
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = false;
				}
			}
		}
		
	}
}
