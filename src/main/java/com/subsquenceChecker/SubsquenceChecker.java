package com.subsquenceChecker;

import java.util.Scanner;

public class SubsquenceChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string have to check: ");
		String a = sc.nextLine();
		System.out.println("Enter String have to compare with: ");
		String b = sc.nextLine();
		System.out.println(isSubSequence(a,b));
	}
	
	public static int isSubSequence(String a, String b){
		if(a.length()==0 || b.length()==0) {
			System.out.println("Invalid input");
			return 0;
		}
		if(a.length()>b.length())
			return 0;
			
        int temp = 0;
        for(int i=0;i<a.length();i++)//akt
        {
        	boolean flag = false;
            for(int j = temp; j<b.length();j++)//ankit
            {
                if(a.charAt(i) == b.charAt(j))
                {
                	flag= true;
                	temp=j+1;
                    break;
                }
            }
            if(!flag)
            	return 0;
        }
        return 1;
    }

}
