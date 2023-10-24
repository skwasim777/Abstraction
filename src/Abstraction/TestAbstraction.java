package Abstraction;

public class TestAbstraction {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}
}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing ractangle...");

	}

}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing circle...");

	}

}
