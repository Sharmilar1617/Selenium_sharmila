package week1.day2.assignments.mandatory;

import java.util.Iterator;

public class PrintDuplicateInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len=arr.length;
int count;
for (int i = 0; i < len-1; i++) {
	int j = arr[i];
	count=0;
	for (int j2 = i+1; j2 < arr.length; j2++) {
		if (j== arr[j2] )
				{
			count++;
		}}
		if(count>0) {
			System.out.println(arr[i]);
		}
		}
	}
	
}
	


