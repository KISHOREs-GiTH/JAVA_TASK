package mc;

class Even extends Thread{
	public void run() {
		for(int i = 0; i<=20; i+=2) {
			System.out.println("Even NUM: "+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Odd extends Thread{
	public void run() {
		for(int i = 1; i<=19; i=i+2) {
			System.out.println("Odd NUM: "+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class MultiThreadEXsec24 {

	public static void main(String[] args) throws InterruptedException {
		Even threadEven = new Even();
		Odd threadOdd = new Odd();
		
		threadEven.start();
		threadOdd.start(); ///the values order are changed due to the race condtion since no synchronized are used.
		
//		threadEven.join();
//		threadOdd.join();
	}

}
