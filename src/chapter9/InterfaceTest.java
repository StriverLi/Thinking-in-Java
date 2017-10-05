package chapter9;

public class InterfaceTest {

	public static void main(String[] args) {
		t a1 = new A();
		a1.print();
		A a2 = new A();
		a2.print();
	}
	
	public static void show(t t1){
		
	}

}

interface t{
	double i = Math.random();
	void print();
}

class A implements t{

	@Override
	public void print() {
		System.out.println(i);
	}
}
