package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test= "I am a software tester";
		String [] split= test.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (i%2!=0) {
				
				char[] ch= split[i].toCharArray();
				String rev="";
				for (int j=ch.length-1; j>= 0 ; j--) {
				rev=rev+ch[j];	
				}
				System.out.println(rev);
			} else {
				System.out.println(split[i]);

			}
			
			
		}
		

	}

}
