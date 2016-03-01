import java.util.*;

public class Permutations {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		permutate("",str);
	}

	public static void permutate(String prefix, String str) {
		int length = str.length();
		/* Occurs if a new string is empty, signifying a permutation is built
		   in prefix */
		if (length == 0)
			System.out.println(prefix);
		else {
			/* 
			 * add first a letter in the current string to the prefix,
			 * then recurse on the rest of the string, not including
			 * the letter just added to the prefix 
			 */
			for (int i = 0; i < length; i++) {
				permutate(prefix + str.charAt(i), 
					      str.substring(0, i) + str.substring(i+1,length));
			}
		}
	}
}