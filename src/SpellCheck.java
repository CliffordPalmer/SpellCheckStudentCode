/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: [YOUR NAME HERE]
 * */

import java.util.ArrayList;
public class SpellCheck {

    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        /**
         * TST code
         * */

        // Create new TST
        TST dict = new TST();

        // Insert each word in the dictionary into the TST
        for(int index = 0; index < dictionary.length; index++) {
            dict.insert(dictionary[index]);
        }

        // Create a TST to store the misspelled words, and an ArrayList to track the order
        // they are added
        TST misspelledWords = new TST();
        ArrayList<String> toReturn= new ArrayList<>();
        // Traverse the text word by word
        for(int index = 0; index < text.length; index++){
            // If the word is misspelled, and hasn't been added before, record it
            if(!dict.lookup(text[index]) && !misspelledWords.lookup(text[index])){
                misspelledWords.insert(text[index]);
                toReturn.add(text[index]);
            }
        }
        // Return the list of misspelled words
        return toReturn.toArray(new String[0]);

        /**
         * Trie code
         * This next section works identically to the first, but uses a Trie instead of a TST
         * */

//        Trie dict = new Trie();
//
//        for(int index = 0; index < dictionary.length; index++) {
//            dict.insert(dictionary[index]);
//        }
//
//        Trie misspelledWords = new Trie();
//        ArrayList<String> toReturn= new ArrayList<>();
//
//        for(int index = 0; index < text.length; index++){
//            if(!dict.lookup(text[index]) && !misspelledWords.lookup(text[index])){
//                misspelledWords.insert(text[index]);
//                toReturn.add(text[index]);
//            }
//        }
//
//        return toReturn.toArray(new String[0]);
    }
}
