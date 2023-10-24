package Abstraction;

public class AbstractionClass extends Bike{

	@Override
	void run() {
		System.out.println("Running Safely.....");
	}
	public static void main(String[] args) {
		Bike b = new AbstractionClass();
		b.run();
	}
		
}
abstract class Bike{
	abstract void run();
}