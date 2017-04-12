package com.practice.algos;

import java.util.*;

public class KeyboardRow {

	public static void main(String args[]) {

		KeyboardRow row = new KeyboardRow();
		row.returnWord("alaska");

	}

	String returnWord(String input) {
		String output = "";

		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = true;
		String row1 = "qwertyuiop";
		String row2 = "asdfghjkl";

		String row3 = "zxcvbnm";

		for (int i = 0; i < input.length(); i++) {
			if ((row1.contains(input.charAt(i) + "")) && flag1 == true) {
				i++;
				flag1 = true;
				if (i == 5) {
					System.out.println("the input is in row1");
				}
			} else {
				flag1 = false;
			}
			System.out.println(input.charAt(i));
			if ((row2.contains(input.charAt(i) + "")) && (flag2 == true)) {
				i++;
				flag2 = true;
				if (i == 5) {
					System.out.println("the input is in row2");
				}
			} else {
				flag2 = false;
			}
			if (row3.contains(input.charAt(i) + "") && flag3 == true) {
				i++;
				flag3 = true;
				if (i == 5) {
					System.out.println("the input is in row3");
				}
			}

			else {
				flag3 = false;
			}

		}

		return output;
	}
}