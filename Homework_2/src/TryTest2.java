public class TryTest2
{
	public static void main (String[] args)
	{
		String msg[] = {"Choi", "Hyun", "Seo"};
		int n = msg.length;
		
		for (int i = 0; i <= n; i++) {
			try {
				System.out.println(msg[i]);	
			}	catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Oops, Sorry. There is an exception.");
			}
			
		}
		System.out.println("Every thing is done.");
	}
}
