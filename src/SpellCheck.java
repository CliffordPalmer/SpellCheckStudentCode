/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: [YOUR NAME HERE]
 * */

import java.util.Stack;
public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        Stack<String> parents = new Stack<>();

        Word[] roots = new Word[27];
        Word[] current = roots;
        for(int index = 0; index < dictionary.length; index++){
            String word = dictionary[index];
            for(int letter = 0; letter < dictionary[index].length(); letter++){
                int letterIndex = (int)(word.charAt(letter) - 'a');
                if(current[letterIndex] == null){
                    current[letterIndex] = new Word(word.substring(0, letter + 1));
                    current[letterIndex].setValid(true);
                }
                current = current[(int)(word.charAt(letter) - 'a')].getChildren();
            }
        }

        for(int i = 0; i < text.length; i++){
            for(int j = 0; j < text[i].length(); j++){

            }
        }


        return null;
    }
}
