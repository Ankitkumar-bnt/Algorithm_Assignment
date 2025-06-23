package com.factorial;

public class FindFactorial {

	public static void main(String[] args) {
				
		System.out.println(factorial(40));
	}

	public static int factorial(int num)
	{
		if(num<0)
			return 0;
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
}
