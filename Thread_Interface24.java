package mc;

class RevNum implements Runnable{

	@Override
	public void run() {
		for(int i = 20; i>=1; i--) {
			System.out.println("Num: "+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class Thread_Interface24 {
	public static void main(String[] args) {
	    RevNum num = new RevNum();
	    Thread t = new Thread(num);
	    t.start();

	}

}
