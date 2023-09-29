package poly;

public class MyClass {


	public void fun1() {
		
		System.out.println("hello");

	}
	
	public void fun1(int i) {
		
		System.out.println(i);

	}

	public void fun1(int i, int j) {

		System.out.println(i+j);
	}
	public void fun1(String str) {
		
		System.out.println(str);

	}
	public void fun1(boolean b1) {
		System.out.println(b1);

	}





	public static void main(String[] args) {
		
		
		MyClass m1 = new MyClass();
		
		m1.fun1(true);

	}







}
