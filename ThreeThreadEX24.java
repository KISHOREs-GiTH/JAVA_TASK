package mc;

class Example extends Thread{
	private String TaskName;
	Example(String name){
		this.TaskName = name;
	}
	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println(TaskName+" : "+i);
			try {
				Thread.sleep(300);
			}
			catch(Exception e ) {
				System.out.println(e);
			}
		}
	}
}
public class ThreeThreadEX24 {

	public static void main(String[] args) {
		Example t1 = new Example("Task 1");
		Example t2 = new Example("Task 2");
		Example t3 = new Example("Task 3");
		t1.start();
		t2.start();
		t3.start();

	}

}
