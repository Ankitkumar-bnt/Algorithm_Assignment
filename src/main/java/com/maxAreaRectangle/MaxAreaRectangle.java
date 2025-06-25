package com.maxAreaRectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxAreaRectangle {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rectangle: ");
        int num = sc.nextInt();
        List<List<Integer>> rectangles = new ArrayList<>();
        for(int i = 0; i<num;i++)
        {
            List<Integer> reactangle = new ArrayList<>();
            System.out.println("Enter length and bridth: ");
            int l = sc.nextInt();
            int b = sc.nextInt();
            
            if(l>0 && b>0) {
            	reactangle.add(l);
                reactangle.add(b);
                rectangles.add(reactangle);
            }
            else
            	System.out.println("Invalid input");
        }
        System.out.println(calculate_Area(rectangles));
    }
    
    public static int calculate_Area(List<List<Integer>> reactangles)
    {
    	Rectangle rect = new Rectangle();
    	int max = 0;
        for(List<Integer> l : reactangles)
        {
        	int rectArea = rect.area(l);
            if(max<rectArea)
                max=rectArea;
        }
        return max;
    }
}
