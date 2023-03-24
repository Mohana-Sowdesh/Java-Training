package questionthree;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}
}

class A {
	
	A() {
		System.out.println("Constructor of A");
	}

}

class B {
	B() {
		System.out.println("Constructor of B");
	}
}

class C extends A {
	B b = new B();
}
