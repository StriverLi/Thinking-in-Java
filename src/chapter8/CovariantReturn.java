package chapter8;


public class CovariantReturn {
	/*
	 * 协变返回类型：
	 * 		表示在子类中的重写方法可以返回基类方法的返回类型的子类
	 */

	public static void main(String[] args) {
		print(new Father());
		print(new Son());
	}
	
	public static void print(Father f){ // 多态
		System.out.println(f.method());
	}

}

class Person {
	public String toString() {
		return "Person";
	}
}

class Student extends Person {
	public String toString() {
		return "Student";
	}
}

// 方法重写是返回值类型可以不同，是子父类，而且要对应好，子类返回值为子类，父类返回值为父类
class Father {
	public Person method() { 
		return new Person();
	}
}

class Son extends Father {
	@Override
	public Student method() { // 返回类型为Person的子类
		return new Student();
	}
}