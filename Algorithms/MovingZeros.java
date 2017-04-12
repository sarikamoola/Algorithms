package com.practice.algos;

import java.util.ArrayList;

public class MovingZeros {
	public static void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0)
			return;

		int insertPos = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[insertPos++] = num;

			}
		}

		while (insertPos < nums.length) {
			nums[insertPos++] = 0;
		}
		System.out.println(nums.length + "");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");
		}

	}

	public static void main(String args[]) {
		int[] nums = { 1, 13, 0, 14, 0 };
		moveZeroes(nums);

	}

}
