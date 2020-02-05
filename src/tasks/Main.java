package tasks;

import java.util.Scanner;

// 031 - Further For Loop Practice 7 (mIxEd CaSe)

class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String s = inp.nextLine();
		//write your code below
		for (int i = 0; i < s.length(); i++) {

				System.out.print(s.substring(i, i + 1).toLowerCase());
				i++;
			if (i == s.length()) {
				break;
			} else {
				System.out.print(s.substring(i, i + 1).toUpperCase());
			}

		}
	}
}