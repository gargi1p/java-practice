package Practice;

class A{
	int a=1;
	void displayA() {
		System.out.println("Value of A:"+a);
	}
	A(){
		System.out.println("Constructor of A");
	}
}
class B extends A{
	int b=2;
	void displayB() {
		System.out.println("Value of B:"+b);
	}
	B(){
		System.out.println("Constructor of B");
	}
}
class C extends B{
	int c=3;
	void displayC() {
		System.out.println("Value of C:"+c);
	}
	C(){
		System.out.println("Constructor of C");
	}
}

public class Inheritance {
	public static void main(String[]arg) {
		A obj1 = new A();
		obj1.displayA();
		B obj2 = new B();
		obj2.displayA();
		obj2.displayB();
		C obj3 = new C();  //jab jab new keyword use hoga, obj create hoga tab tab constructor call hoga 
		obj3.displayA();
		obj3.displayB();
		obj3.displayC();
		
	}
}
