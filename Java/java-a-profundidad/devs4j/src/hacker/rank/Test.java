package hacker.rank;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();

		if(n<=1 && n<= 100) {
			
		if (n % 2 > 0) {
			System.out.println("Weird");
		} else {
			if (n >= 2 && n <= 5) {
				System.out.println("Not Weird");
			}

			if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			}

			if (n >= 20) {
				System.out.println("Not Weird");
			}
		}
		}
	}
}
