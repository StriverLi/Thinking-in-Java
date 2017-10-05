package chapter8;

public class InitOrder {
	/*
	 * 初始化的实际过程是：
	 * 		1.静态变量在类加载是初始化
	 * 		2.将分配给对象的存储空间初始化成二进制的0，即先将所有的非静态成员变量初始化成0
	 * 		3.如果有父类，先调用父类构造方法
	 * 		4.按照声明的顺序调用初始化成员变量
	 * 		5.调用导出类的构造方法
	 */

	public static void main(String[] args) {
		new Circle();
	}

}
class Shape{
	public Shape(){
		System.out.println("Shape构造方法");
		print();
		System.out.println("Shape构造方法");
	}
	
	public void print(){
		System.out.println("父类");
	}
	
}

class Circle extends Shape{
	private int i = 1;
	private static int j = 1;
	public Circle(){
		super();    // 这里会默认调用父类构造
		System.out.println("Circle构造方法");
		print();
		System.out.println("Circle构造方法");
	}
	
	public void print(){
		System.out.println("子类,i=" + i + ",j=" + j);
	}
}