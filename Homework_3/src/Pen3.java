public class Pen3 {
	String vender;
	String color;
	int price;

	Pen3() {
	}
	
	Pen3(String col) {
		color = col;
	}
	
	Pen3(String name, String col) {
		vender = name;
		color = col;
	}
	
	Pen3(int value) {
		price = value;
	}
	
	Pen3(String name, String col, int pp) {
		vender = name;
		color = col;
		price = pp;
	}
	
	public void write() {
		System.out.println("Pen : write()");
		System.out.println("Pen Vender :" + vender);
		System.out.println("Pen Color : " + color);
		System.out.println("Pen Price : " + price);
	}
	
	public void write(int xx) {
		System.out.println("Pen : write()");
		System.out.println("Pen Vender :" + vender);
		System.out.println("Pen Color : " + color);
		System.out.println("Pen Price : " + xx);
	}
	
	public void write(String yy) {
		System.out.println("Pen : write()");
		System.out.println("Pen Vender :" + yy);
		System.out.println("Pen Color : " + color);
		System.out.println("Pen Price : " + price);
	}
	
	public void write(int xx, String yy, String zz) {
		System.out.println("Pen : write()");
		System.out.println("Pen Vender :" + yy);
		System.out.println("Pen Color : " + zz);
		System.out.println("Pen Price : " + xx);
	}
	
	public void earse() {
		System.out.println("Pen : erase()");
	}
}
