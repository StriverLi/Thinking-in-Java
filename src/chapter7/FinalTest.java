package chapter7;

public class FinalTest {
	final int i = 0; // final修饰基本数据类
	final Test t1 = new Test(); // final修饰引用数据类型
	final int j; // 空白final，必须在构造器中初始化，否则会报错
	public FinalTest(){
		j = 1;
	}
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		//ft.i = 2; // 无法更改值，报错
		ft.t1.i = 3; //可以改变引用数据的值
		System.out.println(ft.t1.i);
		//ft.t1 = new Test(); // 无法指向另一个对象，报错
		final int a; // 空白final，在使用前初始化
	}

}

class Test {
	int i = 0;
}
