public class School {
	Teacher hyunseo;
	Student kim, song, park, lee;
	Employee one, two, three;
	Members members[];
	
	public School() {
		hyunseo = new Teacher("Choi", 486486, "IT��������");
		kim = new Student("kim", 210324, "IT��������");
		song = new Student("song", 200324, "IT��������");
		park = new Student("park", 190324, "IT��������");
		one = new Employee("one", 111111, "��ȭ��");
		two = new Employee("two", 222222, "��ȭ��");
		three = new Employee("three",333333, "��ȭ��");
		
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
