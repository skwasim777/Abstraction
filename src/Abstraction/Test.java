package Abstraction;

public class Test {
	public static void main(String[] args) {
		A a = new C();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}

interface A {
	void a();

	void b();

	void c();

	void d();
}

abstract class B implements A {
	public void c() {
		System.out.println("i am c..");
	}
}

class C extends B {

	@Override
	public void a() {
		System.out.println("i am a..");
	}

	@Override
	public void b() {
		System.out.println("i am b..");
	}

	@Override
	public void d() {
		System.out.println("i am d..");
	}

}