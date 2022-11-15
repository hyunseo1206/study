class PenUser3
{
	public static void main(String[] args)
	{
		System.out.println("Hello Pen!");
		
		Pen3 mypen = new Pen3();
		mypen.write();
		
		Pen3 mypen2 = new Pen3 ("Red");
		mypen2.write("IT");
		
		Pen3 mypen3 = new Pen3(1000);
		mypen3.write(2000);
		
		Pen3 mypen4 = new Pen3("SMU", "Yello", 5000);
		mypen4.write(3000, "ICT", "BLUE");
	}
}
