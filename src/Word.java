public class Word {

    private String word;
    private Word[] children;
    private boolean isValid;


    public Word(String word){
        this.word = word;
        isValid = false;
        children = new Word[27];
    }

    private void setChild(Word child){
        int index;
        if(child.getWord().charAt(word.length()-1) == 39){
            index = 26;
        }
        else{
            index = child.getWord().charAt(word.length()-1) -'a';
        }
        children[index] = child;
    }

    public String getWord() {
        return word;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public boolean isValid() {
        return isValid;
    }

    public Word[] getChildren() {
        return children;
    }
}
