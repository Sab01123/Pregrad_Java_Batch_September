package pack2;

public class PrimeNums {
	
	                     //12       1,2,3,4,6,12
	public void prime(int n) {
		
		for(int i=1; i<=n; i++) {
			
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
		
		
	}
	
	
	
	public void check(char n) {
		
		
		if(n>='a' && n<='z'|| n>='A' && n<='Z') {		
			
			if(n=='a') {
				
			}else {
				System.out.println("consonant");
			}
			
		}
		else {
			System.out.println("invalid");
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		PrimeNums p1 = new PrimeNums();
		p1.prime(12);
		p1.check('*');
		
		
	}

}
