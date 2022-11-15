public class School {
	Teacher hyunseo;
	Student kim, song, park, lee;
	Employee one, two, three;
	Members members[];
	
	public School() {
		hyunseo = new Teacher("Choi", 486486, "IT공학전공");
		kim = new Student("kim", 210324, "IT공학전공");
		song = new Student("song", 200324, "IT공학전공");
		park = new Student("park", 190324, "IT공학전공");
		one = new Employee("one", 111111, "미화부");
		two = new Employee("two", 222222, "미화부");
		three = new Employee("three",333333, "미화부");
		
		members = new Members[7];
		members[0] = hyunseo;
		members[1] = kim;
		members[2] = song;
		members[3] = park;
		members[4] = one;
		members[5] = two;
		members[6] = three;
	}
	
	public void makeWork() {
		int n = members.length;
		for (int i=0; i<n; i++) {
			members[i].work();
		}
	}
	
	public static void main(String args[]) {
		School mycom = new School();
		mycom.makeWork();
	}
}
