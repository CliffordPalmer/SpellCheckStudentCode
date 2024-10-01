public class Node {
    private boolean isWord;
    Node[] next;

    public Node(){
        isWord = false;
        next = new Node[256];
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public Node[] getNext() {
        return next;
    }

    public void createNextWord(int index, Node word){
        next[index] = word;
    }
}
