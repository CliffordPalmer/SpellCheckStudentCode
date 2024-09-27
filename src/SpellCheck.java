/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: [YOUR NAME HERE]
 * */

import java.util.Stack;
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


        Word[] roots = new Word[27];
        Word[] current;
        for(int index = 0; index < dictionary.length; index++){
            System.out.println(index);
            String word = dictionary[index].toLowerCase();
            current = roots;
            for(int letter = 0; letter < dictionary[index].length(); letter++){
                int letterIndex;
                if(word.charAt(letter) == 39){
                    letterIndex = 26;
                }
                else{
                    letterIndex = (int)(word.charAt(letter) - 'a');
                }
                if(current[letterIndex] == null){
                    current[letterIndex] = new Word(word.substring(0, letter + 1));
                    if(current[letterIndex].getWord().equals(word)){
                        current[letterIndex].setValid(true);
                    }
                }
                current = current[letterIndex].getChildren();
            }
        }

        ArrayList<String> wrongWords = new ArrayList<>();
        current = roots;
        for(int i = 0; i < text.length; i++){
            System.out.println(i);
            String word = text[i].toLowerCase();
            current = roots;
            for(int j = 0; j < text[i].length(); j++){
                int letterIndex;
                if(word.charAt(j) == 39){
                    letterIndex = 26;
                }
                else{
                    letterIndex = (int)(word.charAt(j) - 'a');
                }
                Boolean isAdded = false;
                for(int x = 0; x < wrongWords.size(); x++){
                    if(word.equals(wrongWords.get(x))){
                        isAdded = true;
                    }
                }
                if(!Character.isLetter(word.charAt(j)) && word.charAt(j) != 39){
                    if(!isAdded) {
                        wrongWords.add(word);
                    }
                    break;
                }
                if(current[letterIndex] == null){
                    if(!isAdded) {
                        wrongWords.add(word);
                    }
                    break;
                }
                else if (j == text[i].length() - 1 && !current[letterIndex].isValid()) {
                   if(!isAdded) {
                       wrongWords.add(word);
                   }
                    break;
                }
                else{
                    current = current[letterIndex].getChildren();
                }
            }

        }

        String[] wrongWordsArr = new String[wrongWords.size()];
        for(int i = 0; i < wrongWords.size(); i++){
            wrongWordsArr[i] = wrongWords.get(i);
        }
        System.out.println("test");
        return wrongWordsArr;
    }
}
