package week3.day2.assignments;

/* Problem 
 *  There will be running number between 1 to 10
 * One of the unique number will be missing
 * Find the missing number
 *
 * Psuedocode
 * a) Remove the duplicates using Set
 * b) Make sure the set is in the ascending order
 * c) Iterate from the starting number and verify the next number is + 1
 * d) If did not match, that is the number
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 6, 7, 4, 8, 9, 10 };

		Set<Integer> set = new TreeSet<Integer>();

		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}

		List<Integer> list = new ArrayList<Integer>(set);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i + 1) != list.get(i) + 1) {
				System.out.println(list.get(i) + 1);
				// System.out.println(i);
				break;
			}
		}

	}

}
