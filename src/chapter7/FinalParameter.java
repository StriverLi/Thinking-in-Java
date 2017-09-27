package chapter7;

public class FinalParameter {
	
	public void withFinal(final Test1 t){ // final修饰参数
		//t = new Test(); // 不能更改引用所指向的对象，报错
	}
	
	public void withoutFinal(Test1 t){
		t = new Test1();
	}

	public static void main(String[] args) {
		FinalParameter fp = new FinalParameter();
		fp.withFinal(null);
		fp.withoutFinal(null);
		Test1 t1 = new Test1();
	}

}

class Test1{
	public void print(){}
}

class Test2 extends Test1{
	public void print(){}
}

