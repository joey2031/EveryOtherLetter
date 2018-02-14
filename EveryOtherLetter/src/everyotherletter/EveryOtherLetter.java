
package everyotherletter;

/**
 *
 * @author Joey
 */
public class EveryOtherLetter {

    public static void main(String[] args) {
       

        String word = ("hello"); // j(0) e(2)
        
        for (int i = 0; i < word.length(); i = i + 2) { // o + 2 = 2, 2 + 2 = 4, 4 + 2 = 6 ....
            // FIRST  i becomes 2 and keeps adding the new answer.

           System.out.println(word.substring(i, i+1));

        }

    
}
}
