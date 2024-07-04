package com.coding.problems.patterns;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array of positive numbers and a positive number 'k', 
 * find the maximum sum of any contiguous subArray of size 'k'.
 *
 * @author deekumar46
 *
 * Dec 9, 2022
 */
public class MaximumSumSubarrayOfSizeK {

	private static int findMaxSumSubArray(final int[] input, final int subArray) {
		int maxSum = 0;
		int windowSum = 0;
		int startWindow = 0;
		int subArrayStartIndex = 0;
		for (int endWindow = 0; endWindow < input.length; endWindow++) {
			windowSum = windowSum + input[endWindow];

			if (endWindow >= subArray - 1) {
				if (windowSum > maxSum) {
					maxSum = windowSum;
					subArrayStartIndex = startWindow;
				}
				windowSum = windowSum - input[startWindow];
				startWindow++;

			}
		}

		final int[] subarray = Arrays.copyOfRange(input, subArrayStartIndex, subArrayStartIndex + subArray);
		System.out.println("Elements of the subArray with maximum sum are: " + Arrays.toString(subarray));
		return maxSum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the input array: ");
		final int size = scanner.nextInt();
		System.out.println("Please provide the input array:");
		final int[] input = new int[size];
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
		}
		System.out.print("Please provide the size of subArray: ");
		final int subArray = scanner.nextInt();

		final int maxSumSubArray = findMaxSumSubArray(input, subArray);
		System.out.print("maximum sum of subArray of size " + subArray + " for the given input is: " + maxSumSubArray);
		scanner.close();
	}

}
