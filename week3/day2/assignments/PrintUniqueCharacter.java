package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

//PrintUniqueCharacter
/* Problem
 * a) Take your name as input
 * b) Print all unique characters only (any order) 
 * Input:  babu
 * Output: a u  
 *Psuedocode
 * a) Convert String to Character array
 * b) Create a new Set -> HashSet
 * c) Add each character to the Set and if it is already there, remove it
 * d) Finally, print the set 
 */
public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String str = "babu";
		char[] charA = str.toCharArray();
		System.out.println(charA);
		
		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < charA.length; i++) {
			if (set.contains(charA[i])) {
				set.remove(charA[i]);
			} else {
				set.add(charA[i]);
			}
		}
		System.out.println(set);
	}
}
