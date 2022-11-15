class Z extends Y{
	int i =30;
	String msg= "I am a Z.";
	
	void print() {
		System.out.println(msg);
		//부모 클래스 있는 메소드를 오버라이딩.
	}
	
	void play() {
		System.out.println("Play.." + msg);
		//부모 클래스 있는 메소드를 오버라이딩.
	}
	
	void doZ() {
		System.out.println("do something in Z.");
	}
	
	void test(int i) {
		Z	z = new Z();
		Y	y = z;
		X	x = z;
		//서로 상속관계에 있는 두 클래스의 경우, 부모 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조하는 것이 가능.
		
		z.print();
		y.print();
		super.print();
		play();
		super.play();
		
		//y.doZ();													//컴파일 에러 (Y 타입의 t 참조변수로, Z의 메소드 사용 불가)
		//super.super.print();										//컴파일 에러 (super 2번 사용하여 오류 발생)
		
		System.out.println("\ni = " + i);							//XYZ.java에서 15라는 인자를 줌. test의 i는 15
		System.out.println("this.i = " + this.i);					//this.i는 z의 i -> 30 출력
		System.out.println("super.i = " + super.i);					//super인 y의 i -> 20 출력
		System.out.println("y.i = " + y.i);							//y는 Y 타입으로 만들어짐 -> Y 클래스의 i인, 20 출력
		System.out.println("x.i = " + x.i);							//x는 X 타입으로 만들어짐 -> X 클래스의 i인, 10 출력
		System.out.println("((Y)this).i = " + ((Y)this).i);			//Y 클래스의 i인 20 출력
		System.out.println("((X)this).i = " + ((X)this).i);			//X 클래스의 i인 10 출력
		//super.super.i = 10										//컴파일 에러 (super 2번 사용하여 오류 발생)
	}
}
