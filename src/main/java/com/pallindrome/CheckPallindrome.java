package com.pallindrome;

public class CheckPallindrome {

	public static void main(String[] args) {
				
		System.out.println(isPallindrome(1));
	}
	
	public static String isPallindrome(int num)
	{
		String str = Integer.toString(num);
		char ch[] = str.toCharArray();
		
		for(int i=0, j=ch.length-1;i<j;i++,j--) {
			if(ch[i] != ch[j])
				return "No";
		}
		return "Yes";
	}

}
