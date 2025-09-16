package mc;


class Vehicle{
	public void move() {
		System.out.println("Move from Vehicle");
	}
}
class Bike extends Vehicle{
	public void move() {
		System.out.println("Move the bike...");
	}
}
public class OverRideEX {
	public static void main(String[] args) {
		Vehicle v = new Bike();
		v.move();
	}
}
