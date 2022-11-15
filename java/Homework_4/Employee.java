public class Employee extends Members
{
	String dept;
	Members employees[];
	
	public Employee(String name, int idnum, String dept) {
		super(name, idnum, dept);
	}
	
	public void setMembers(Members sub[]) {
		employees = sub;
	}
	
	public void work() {
		System.out.println("Employee: \"" + name + "(ID:"+id+")" +"\" works hard in " + dept +" dept.");
	}
}
