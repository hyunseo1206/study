public class Teacher extends Members 
{
	String dept;
	Members teachers[];
	
	public Teacher(String name, int idnum, String dept) {
		super(name, idnum, dept);
	}
	
	public void setMembers(Members sub[]) {
		teachers = sub;
	}
	
	public void work() {
		System.out.println("Teacher: \"" + name + "(ID:"+id+")" +"\" teaches with his students in " + dept +" dept.");
	}
}
