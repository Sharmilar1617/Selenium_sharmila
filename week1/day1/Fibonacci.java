package week1.day1;

//import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnumb=0,secondnumb=1,sum=0;
		System.out.println(firstnumb);
		System.out.println(secondnumb);
		for(int i =1;i<=11;i++)
		{
			sum=firstnumb+secondnumb;
			firstnumb=secondnumb;
			secondnumb=sum;
			System.out.println(sum);
		}
		}
		

	}

