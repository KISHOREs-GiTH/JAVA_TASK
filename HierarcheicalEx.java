package mc;

class Vehicle1{
	String brand;
	double price ;
	void displayInfo() {
		System.out.println("Brand: "+brand +"Price: "+price);
	}
}

class Car extends Vehicle1{
	int numOfDoors = 5;
	void showCarDetails() {
		displayInfo();
		System.out.println("There are "+numOfDoors+" doors in the car..");
	}
}
class Bike1 extends Vehicle1{
	boolean hasGear = true;
	void showBikeDetails() {
		displayInfo();
		System.out.println("It has gear? :"+hasGear);
	}
}
class Truck extends Vehicle1{
	int loadCapacity = 500000;
	public void showTruckDetails() {
		displayInfo();
		System.out.println("Truck capacity is: "+loadCapacity);
	}
}
public class HierarcheicalEx extends Vehicle1{
	public static void main(String[] args) {
//		HierarcheicalEx obj = new HierarcheicalEx();
//		obj.displayInfo();
		
		Car obj2 = new Car();
		obj2.brand="Tata";
		obj2.price = 600000;
		obj2.showCarDetails();
		
		Bike1 obj3 = new Bike1();
		obj3.brand = "Yamaha";
		obj3.price = 200000;
		obj3.showBikeDetails();
		
		Truck obj4 = new Truck();
		obj4.brand = "Scannia";
		obj4.price = 100000000;
		obj4.showTruckDetails();
		
	}
	

}
