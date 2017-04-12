package com.practice.algos;

public class ExcelsheetProblem {
	public static void main(String args[]) {
		int x = ExcelSheet("ZA");
		System.out.println(x + "");
	}

	public static int ExcelSheet(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); result = result * 26
				+ (s.charAt(i) - 'A' + 1), i++)
			;
		return result;
	}
}
