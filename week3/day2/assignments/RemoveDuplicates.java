package week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Declare a String as PayPal India
//Convert it into a character array
//Declare a Set as charSet for Character
//Declare a Set as dupCharSet for duplicate Character
//Iterate character array and add it into charSet
//if the character is already in the charSet then, add it to the dupCharSet
//Check the dupCharSet elements and remove those in the charSet
//Iterate using charSet
//Check the iterator variable isn't equals to an empty space
//print it

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "PayPal India";
		char[] char1 = text.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (int i = 0; i < char1.length; i++) {
			if (charSet.contains(char1[i])) {
				dupCharSet.add(char1[i]);
			} else {
				charSet.add(char1[i]);
			}
		}
		List<Character> charList = new ArrayList<Character>();
		
		charList.addAll(charSet);
		for (int i = 0; i < charList.size(); i++) {
			if (charList.get(i) == ' ') {
				charList.remove(charList.get(i));
			}
		}
		System.out.println(charList);
	}
}
