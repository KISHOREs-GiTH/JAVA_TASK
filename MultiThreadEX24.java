package mc;

class Task extends Thread{
	private String threadName;
	Task(String name){
		this.threadName = name;
	}
public  void run() {
	for(int i = 0; i<=5; i++) {
		System.out.println(threadName+" prints: "+i);
	try {
		Thread.sleep(500);
	}
	catch(Exception e) {
		System.out.println(e);
	    } 
	  }
   }
}
public class MultiThreadEX24 {

	public static void main(String[] args) {
		Task t1 = new Task("Thread one");
		Task t2 = new Task("Thread two");
		Task t3 = new Task("Thread three");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
