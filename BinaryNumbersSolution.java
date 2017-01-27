package com.javaproject.restfull.Restful;

import java.util.Scanner;

public class BinaryNumbersSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		String s = Integer.toBinaryString(n);
		int counter = 0;
		int previousCounter = 0;
		char arr[] = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				counter++;
			}
			if (arr[i] == '0' || i == arr.length - 1) {
				if (previousCounter < counter) {
					previousCounter = counter;
				}
				counter = 0;
			}

		}

		System.out.println(previousCounter);
	}
}
