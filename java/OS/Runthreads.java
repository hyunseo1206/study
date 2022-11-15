class X extends Thread {
	public void run() {
		for (int x=10; x<15; x++)
			System.out.println("\nThread X : x= " + x);
	}
}

class Y extends Thread {
	public void run() {
		for (int y=100; y>90; y--)
			System.out.println("\nThread Y : y = " + y);
	}
}

public class Runthreads {
	public static void main (String args[]) {
		X th_x = new X();
		Y th_y = new Y();
		th_x.start();
		th_y.start();
		System.out.println("\nMain Thread Exiting 1 ...");
		System.out.println("\nMain Thread Exiting 2 ...");
		System.out.println("\nMain Thread Exiting 3 ...");
		System.out.println("\nMain Thread Exiting 4 ...");
		System.out.println("\nMain Thread Exiting 5 ...");
		System.out.println("\nMain Thread Exiting 6 ...");
		
	} 
}
