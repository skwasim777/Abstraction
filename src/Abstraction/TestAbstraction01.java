package Abstraction;

/*
 * creating a test class which calls abstract and non abstract method
 */
public class TestAbstraction01 {
	public static void main(String[] args) {
		Bike01 b = new Honda();
		b.run();
		b.changeGear();
	}
}

/*
 * example of abstract class which has abstract and non abstract method and
 * cunstructor
 */
abstract class Bike01 {
	public Bike01() {
		System.out.println("bike is created...");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed....");
	}
}

/*
 * creating a child class which inherits abstract class
 */
class Honda extends Bike01 {
	@Override
	void run() {
		System.out.println("Running Safely....");
	}

}