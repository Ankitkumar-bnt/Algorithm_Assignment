package com.confussedPappu;

import java.util.Scanner;

public class ConfussedPappu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount: ");
		int amount = 0;

		if (sc.hasNextInt()) {
			amount = sc.nextInt();
			if (amount < 0) {
				System.out.println("Invaild input");
				return;
			}
			System.out.println(findDiff(amount));
		}
		else
			System.out.println("Invaild input");

		sc.close();
	}

	public static int findDiff(int amount) {
		int temp = makeReverse(amount);
		temp = makeReverse(temp);
		return temp - amount;
	}

	public static int makeReverse(int num) {
		int temp = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem == 6)
				rem = 9;
			temp = temp * 10 + rem;
			num /= 10;
		}
		return temp;
	}
}

