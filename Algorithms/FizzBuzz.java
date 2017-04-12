package com.practice.algos;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();
		for (int x = 1; x <= n; x++) {
			if (x % 3 == 0 && x % 5 != 0) {
				list.add("Fizz");
			} else if (x % 5 == 0 && x % 3 != 0) {
				list.add("\"Buzz\"");
			} else if (x % 5 == 0 && x % 3 == 0) {
				list.add("\"FizzBuzz\"");
			} else {
				list.add("\"" + x + "\"");
			}

		}
		return list;
	}

	public static List<String> fizzBuzz1(int n) {
		List<String> ret = new ArrayList<String>(n);
		for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
			fizz++;
			buzz++;
			if (fizz == 3 && buzz == 5) {
				ret.add("FizzBuzz");
				fizz = 0;
				buzz = 0;
			} else if (fizz == 3) {
				ret.add("Fizz");
				fizz = 0;
			} else if (buzz == 5) {
				ret.add("Buzz");
				buzz = 0;
			} else {
				ret.add(String.valueOf(i));
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		List<String> list = fizzBuzz1(15);
		System.out.println(list);

	}
}