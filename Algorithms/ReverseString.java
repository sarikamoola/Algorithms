package com.practice.algos;

public class ReverseString {

	public static String reverseString(String s) {

		char[] word = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char temp = word[i];
			word[i] = word[j];
			word[j] = temp;
			i++;
			j--;
		}
		return new String(word);
	}

	public static void main(String[] args) {
		String s = reverseString("Panama!");
		System.out.println(s);
	}

}
