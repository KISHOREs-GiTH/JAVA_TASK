package mc;

public class Student {
	private String name;
	private int rollNum;
	private int marks;
	
	public String getName() {
		return name;
	}
	public int getnum() {
		return rollNum;
	}
	public int getMarks() {
		return marks;
	}
	public void setName(String peru) {
		this.name = peru;
	}
	public void setnum(int roll) {
		this.rollNum = roll;
	}
	public void setMarks(int ma) {
		this.marks = ma;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Akshu");
		s.setnum(11);
		s.setMarks(99);
		System.out.println("Name: "+ s.getName()+" RollNum: "+s.getnum()+" Marks: "+ s.getMarks());
	}

}
