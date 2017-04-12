package com.practice.algos;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
	// public static int singleNumber(int[] nums) {
	public static int singleNumber(int A[], int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result ^= A[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 1;
		nums[1] = 1;
		nums[2] = 8;
		nums[3] = 2;
		nums[4] = 2;
		int x = singleNumber(nums, 5);
		System.out.println(x + "");

	}
}
