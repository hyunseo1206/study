class Z extends Y{
	int i =30;
	String msg= "I am a Z.";
	
	void print() {
		System.out.println(msg);
		//�θ� Ŭ���� �ִ� �޼ҵ带 �������̵�.
	}
	
	void play() {
		System.out.println("Play.." + msg);
		//�θ� Ŭ���� �ִ� �޼ҵ带 �������̵�.
	}
	
	void doZ() {
		System.out.println("do something in Z.");
	}
	
	void test(int i) {
		Z	z = new Z();
		Y	y = z;
		X	x = z;
		//���� ��Ӱ��迡 �ִ� �� Ŭ������ ���, �θ� Ŭ���� Ÿ���� ���������� �ڼ� Ŭ������ �ν��Ͻ��� �����ϴ� ���� ����.
		
		z.print();
		y.print();
		super.print();
		play();
		super.play();
		
		//y.doZ();													//������ ���� (Y Ÿ���� t ����������, Z�� �޼ҵ� ��� �Ұ�)
		//super.super.print();										//������ ���� (super 2�� ����Ͽ� ���� �߻�)
		
		System.out.println("\ni = " + i);							//XYZ.java���� 15��� ���ڸ� ��. test�� i�� 15
		System.out.println("this.i = " + this.i);					//this.i�� z�� i -> 30 ���
		System.out.println("super.i = " + super.i);					//super�� y�� i -> 20 ���
		System.out.println("y.i = " + y.i);							//y�� Y Ÿ������ ������� -> Y Ŭ������ i��, 20 ���
		System.out.println("x.i = " + x.i);							//x�� X Ÿ������ ������� -> X Ŭ������ i��, 10 ���
		System.out.println("((Y)this).i = " + ((Y)this).i);			//Y Ŭ������ i�� 20 ���
		System.out.println("((X)this).i = " + ((X)this).i);			//X Ŭ������ i�� 10 ���
		//super.super.i = 10										//������ ���� (super 2�� ����Ͽ� ���� �߻�)
	}
}
