package week3.day2.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "Sharmila";
		char[] charArray = myName.toCharArray();
		Set<Character> printunique= new LinkedHashSet<>();
	
	
		for (int i = 0; i < charArray.length; i++) {
			 boolean add= printunique.add(charArray[i]);

		}
		System.out.println(printunique);
		
		
	}

}
