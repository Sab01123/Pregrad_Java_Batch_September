package interfacePack;

public class MyFirstInterfaceIMPL implements MyFirstInterface{

	@Override
	public void sum1(int i, int j) {
		System.out.println("Sum of two numbers= "+(i+j));
		
	}

	@Override
	public void subtraction(int num1, int num2) {
		System.out.println("subtraction of two numbers = "+ (num1-num2));
	}

}
