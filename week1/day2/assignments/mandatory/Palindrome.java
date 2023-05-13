package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="madam";
		char[] ch=s.toCharArray();
	String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev= rev+ch[i];
		}
		System.out.println(rev);
		}
		

	}


