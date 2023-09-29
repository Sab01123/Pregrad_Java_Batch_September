package Conditional;

public class Transfer {
	
	
	
public static int sumOfNaturalNums(int num) {

	int ans = (num*(num+1))/2;
	
	return ans;
	

	
}
//	











public  void nums(char character) {


	
}
	
public static void prime(int num) {

	for(int i=1; i<=num; i++) {
		if(num%i==0) {
			System.out.println(i);
		}
	}
	

	
}
	
	
public static void charr(char n) {

	if(n>='a' && n<='z' || n>='A' && n<='Z') {
		if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u' || n=='A' || n=='E' || n=='I' || n=='O' || n=='U') {
			System.out.println("character is vowel");
		}else {
			System.out.println("consonant...");
		}
	}
	else System.out.println("invalid");

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//relatives  10
		// 1,2,3,not going4,5,6,7,8,9,10
	
	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
			
			if(i==4) {
				continue;
			}
			else {
				System.out.println(i+" going back to home, happy...");
			}
			
		}
		
		
		Transfer t1 = new Transfer();
		t1.prime(12);
		t1.charr('B');
		
		
	}
	
	
	
	
	
	

}
