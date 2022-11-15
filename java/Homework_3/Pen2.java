public class Pen2
{
	String vender;
	String color;
	int price;
	
	public Pen2() {
	}
	
	public Pen2(String col) {
		color = col;
	}
	
	public Pen2(String name, String col) {
		vender = name;
		color = col;
	}
	
	public Pen2(int value) {
		price = value;
	}
	
	Pen2(String name, String col, int pp) {
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
	
	public void earse() {
		System.out.println("Pen : earse()");
	}
}
