package mc;


abstract class Shape{
	abstract void area();
	public void displayShape() {
		System.out.println("Non abt method display Shape...");
	}
}

class circle extends Shape{

	@Override
	void area() {
		System.out.println("Circle area...");
	}
	
}
class rectangle extends Shape{

	@Override
	void area() {
		System.out.println("Rectangle area...");
		
	}
	
}
public class abtQ1 {

	public static void main(String[] args) {
		Shape s = new circle();
		s.displayShape();
		s.area();
		Shape ss = new rectangle();
		ss.area();
		

	}

}
