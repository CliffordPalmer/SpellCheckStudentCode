/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: [YOUR NAME HERE]
 * */

import java.lang.reflect.Array;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashSet;
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
        TST dict = new TST();
        for(int index = 0; index < dictionary.length; index++) {
            dict.insert(dictionary[index]);
        }
        System.out.println("test");
        return null;
//        Trie dict = new Trie();
//        for(int index = 0; index < dictionary.length; index++) {
//            dict.insert(dictionary[index]);
//        }
//
//        Trie misspelledWords = new Trie();
//
//        ArrayList<String> toReturn= new ArrayList<>();
//
//        for(int index = 0; index < text.length; index++){
//            if(!dict.lookup(text[index]) && !misspelledWords.lookup(text[index])){
//                misspelledWords.insert(text[index]);
//                toReturn.add(text[index]);
//            }
//        }
//        return toReturn.toArray(new String[0]);
    }
}
