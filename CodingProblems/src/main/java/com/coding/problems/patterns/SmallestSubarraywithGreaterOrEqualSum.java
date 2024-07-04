package com.coding.problems.patterns;

import java.util.Scanner;

/**
 * Given an array of positive numbers and a positive number 'S', find the length
 * of the smallest contiguous subArray whose sum is greater than or equal to
 * 'S'. Return 0 if no such subArray exists.
 *
 * @author deekumar46 Dec 9, 2022
 */
public class SmallestSubarraywithGreaterOrEqualSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the input array: ");
		final int size = scanner.nextInt();
		System.out.println("Please provide the input array:");
		final int[] input = new int[size];
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
		}
		System.out.print("Please enter the sum value: ");
		final int sum = scanner.nextInt();

		int minSubArray = findMinSubArray(input, sum);

		System.out.print("Minimum length for given sum: " + minSubArray);

		scanner.close();

	}

	private static int findMinSubArray(final int[] input, final int sum) {
		int startWindow = 0;
		int windowSum = 0;
		int minLength = Integer.MAX_VALUE;
		for (int endWindow = 0; endWindow < input.length; endWindow++) {
			windowSum = windowSum + input[endWindow];

			while (windowSum >= sum) {
				minLength = Math.min(endWindow - startWindow + 1, minLength);
				windowSum = windowSum - input[startWindow];
				startWindow++;
			}

		}
		final int result = minLength == Integer.MAX_VALUE ? 0 : minLength;
		System.out.print("smallest contiguous subArray whose sum is greater than or equal to, "+sum +"is:" + 3);
		return result;

	}

}
