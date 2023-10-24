package Abstraction;

public class TestBank {
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("Rate Of Inyterest Is = " + b.getRateOfinterest() + " %");
		b = new HDFC();
		System.out.println("Rate Of Inyterest Is = " + b.getRateOfinterest() + " %");
		b = new ICICI();
		System.out.println("Rate Of Inyterest Is = " + b.getRateOfinterest() + " %");
	}
}

abstract class Bank {
	abstract int getRateOfinterest();
}

class SBI extends Bank {

	@Override
	int getRateOfinterest() {

		return 7;
	}

}

class HDFC extends Bank {

	@Override
	int getRateOfinterest() {

		return 10;
	}

}

class ICICI extends Bank {

	@Override
	int getRateOfinterest() {

		return 12;
	}

}