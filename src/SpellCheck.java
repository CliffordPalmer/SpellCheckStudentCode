 /**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: [YOUR NAME HERE]
 * */

import java.util.LinkedHashSet;
public class SpellCheck {

    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        LinkedHashSet<String> dict = new LinkedHashSet<>();
        for(String word : dictionary) {
            dict.add(word);
        }
        LinkedHashSet<String> isAdded = new LinkedHashSet<>();
        for (String word : text) {
            if (!dict.contains(word)) {
                if (!isAdded.contains(word)) {
                    isAdded.add(word);
                }
            }
        }
        return isAdded.toArray(new String[0]);
    }
}
