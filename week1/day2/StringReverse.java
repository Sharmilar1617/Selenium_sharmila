package week1.day2;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "TestLeaf";
		char[] ch= input.toCharArray();
	
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}

}
}
