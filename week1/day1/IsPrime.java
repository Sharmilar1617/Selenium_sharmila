package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		int number=9;
		
		boolean prime=true;
		
		for (int i = 2; i <= number-1; i++) {
			
			if (number%i==0) {
				
				prime=false;
				
				System.out.println("Not prime");
				break;
				
			}
			
			
		}
		
		System.out.println(prime);
			
		}
			}

		

	


