package week3.day2.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] strWords = text.split("\\s+");
		//String[] sp = text.split("");
	for (int i = 0; i < strWords.length; i++) {
String st= strWords[i];
//System.out.println(st);
	}
		Set<String> strset = new LinkedHashSet<String>();
		for (int i = 0; i < strWords.length; i++) {
		strset.add(strWords[i]);
			
		}

	System.out.println(strset);
	
}

	}
	


