package mc;


class Printer{
	public void print(int a) {
		System.out.println("integer :"+ a);
	}
	public void print(String b) {
		System.out.println("String b: "+ b);
	}
	public void print(double c) {
		System.out.println("Double:" +c );
	}
}
public class OverloadEX {
	public static void main(String[] args) {
		Printer sp = new Printer();
		sp.print(789.08);
		sp.print(24);
		sp.print("AKshu");
	}

}
