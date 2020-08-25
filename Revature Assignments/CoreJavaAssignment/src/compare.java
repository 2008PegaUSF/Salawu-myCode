import java.util.Comparator;

public class compare {

	String name, department;
	int age;
	
	public compare(String name, String department, int age) {
		this.name = name;
		this.department = department;
		this.age = age;
	}
	
	public String toString() {
		return "\nEmployee Name:- "+this.name+ "\nDepartment:- "+this.department+"\nEmployee age:- "+this.age+"";
	}
	
	class Sortbyname implements Comparator<compare>{
		//this sorts the name in ascending order
		public int compare(compare a, compare b) {
			return a.name.compareTo(b.name);
		}
	}
	
	class Sortbydepartment implements Comparator<compare>{
		//this sorts the name in ascending order
		public int compare(compare a, compare b) {
			return a.name.compareTo(b.name);
		}
	}
	
	class Sortbyage implements Comparator<compare>{
		//this sorts the name in ascending order
		public int compare(compare a, compare b) {
			return a.name.compareTo(b.name);
		}
	}
}
