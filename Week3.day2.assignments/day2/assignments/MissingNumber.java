package week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4,6,7,8,9,11};
		HashSet<Integer> missset=new HashSet<Integer>(); 
		for (Integer num : data) {
			
			missset.add(num);
	}

	
		for (int j = 0; j <=data.length+1; j++) {
			if(!missset.contains(j)) {
			
			System.out.println(j);
			
		}
			}
		}
	}

	
		


