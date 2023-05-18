package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "google";
		List<String> list=new ArrayList();
		int listsize= list.size();
		Set <String> unique=new TreeSet<>(list);
		int setsize=unique.size();
		System.out.println(setsize);
		if(listsize==setsize) {
			System.out.println("no duplicates");
		}
		else
		{
			System.out.println("there are duplicate values");
		}
		
	}

}
