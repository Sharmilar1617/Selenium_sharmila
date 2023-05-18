package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "google";
		char[] charArray = companyName.toCharArray();
		Set<Character> unique= new LinkedHashSet<>();
	
	
		for (int i = 0; i < charArray.length; i++) {
			 boolean add= unique.add(charArray[i]);

		}
		System.out.println(unique);
		}
}

