package com.anagramString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 string: ");
		
		System.out.println(remAnagram(sc.nextLine().toLowerCase(), sc.nextLine().toLowerCase()));
	}
	
	public static int remAnagram(String s1, String s2)
	{
		List<Character> ch1 = new ArrayList<>();
		for(char c:s1.toCharArray())
			ch1.add(c);
		Collections.sort(ch1);
		
		List<Character> ch2 = new ArrayList<>();
		for(char c:s2.toCharArray())
			ch2.add(c);
		Collections.sort(ch2);
		
		if(ch1.size()>ch2.size())
		{
			return getExtraChar(ch1,ch2);
		}
		else
			return getExtraChar(ch2, ch1);
	}
	
	private static int getExtraChar(List<Character> char1, List<Character> char2)
	{
		List<Character> temp = new ArrayList<>(char1);
		for(char c:temp)
		{
			if(char2.contains(c))
			{
				char1.remove(Character.valueOf(c));
				char2.remove(Character.valueOf(c));
			}
		}
		return char1.size()+char2.size();
	}

}
