
package q1_01_is_unique;

import Q1_01_Is_Unique.QuestionA;
import Q1_01_Is_Unique.QuestionB;

public class Q1_01_Is_Unique {

    public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
                        QuestionA qA = new QuestionA();
                        QuestionB qB = new QuestionB();
			boolean wordA =  qA.isUniqueChars(word);
			boolean wordB =  qB.isUniqueChars(word);
			if (wordA == wordB) {
				System.out.println(word + ": " + wordA);
			} else {
				System.out.println(word + ": " + wordA + " vs " + wordB);
			}
		}
	}
    
}
