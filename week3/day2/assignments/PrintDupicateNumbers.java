package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Problem Statement : Print only duplicate values
 * Expected output: 4 and 8
 * 
 * How to solve?
 * 1) Regular for loop
 * 2) Using Set
 * 
 * Using Set 
 * a) Add every element into Set
 * b) If it is already there in the Set -> Print duplicate
 */
public class PrintDupicateNumbers {

	public static void main(String[] args) {

		int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };
		
		Set<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			if (set.contains(data[i])) {
				System.out.println("Duplicate Number = " + data[i]);
			} else {
				set.add(data[i]);
			}
		}

	}
}
