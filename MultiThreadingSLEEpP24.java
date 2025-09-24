package mc;

class MultiEx extends Thread{
	private String ThreadName;
	private int sleepTime;
	
	MultiEx(String Tname, int Stime){
		this.ThreadName = Tname;
		this.sleepTime = Stime;
	}
	@Override
	public void run() {
		for(int i = 1; i<6; i++) {
			System.out.println("ThreadName: "+ThreadName+" Counter: "+i);
			try {
				Thread.sleep(sleepTime);
			}
       		catch(Exception e ) {
			    System.out.println(e);
		    }
	    }
    }
}
public class MultiThreadingSLEEpP24 {

	public static void main(String[] args) {
		MultiEx t1 = new MultiEx("Thread 1",500);
		MultiEx t2 = new MultiEx("Thread 2",700);
		MultiEx t3 = new MultiEx("Thread 3",1000);
		
		t1.start();
		t2.start();
		t3.start();
		
		//wait to all finish
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("All thread completed its Execution...");

	}

}
