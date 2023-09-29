package problems;

public class Main {
	
	public static void getNoise(Animal animal) {
		
		animal.makeNoise();
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		Main.getNoise(a1);
		Main.getNoise(a2);
		
		
	}

}
