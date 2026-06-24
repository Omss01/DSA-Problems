package com.array;

import java.util.Arrays;

public class MoveZero {
	public void moveZeroes(int[] nums) {
		int i = 0;
		int j = nums.length - 1;

		while (i < j) {
			if (nums[j] == 0) {
				j--;
			} else if (nums[i] != 0) {
				i++;
			} else {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(nums));

	}

	public static void main(String[] args) {
		MoveZero obj=new MoveZero();
		obj.moveZeroes(new int[] {0,1,0,3,12});
	}
}
