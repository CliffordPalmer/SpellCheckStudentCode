public class Word {

    private String word;
    private String[] children;

    public Word(String word){
        this.word = word;
    }

    private void makeChildren(){
        children = new String[27];
    }
    private void setChild(String child){
        int index = child.charAt(word.length()-1) -'a';
        children[index] = child;
    }
}
