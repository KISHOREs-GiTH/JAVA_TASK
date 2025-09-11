package mc;



public class Poly_Stud_ex {
	
	public int calculateMarks(int sub1, int sub2) {
		return sub1 + sub2;
	}
	public int calculateMarks(int sub1, int sub2, int sub3) {
		return sub1 + sub2 + sub3;
	}
	public double calculateMarks(double marks) {
		return marks;
	}
	public static void main(String[] args) {
		Poly_Stud_ex ob = new Poly_Stud_ex();
		System.out.println(ob.calculateMarks(45.50));
	}

}
