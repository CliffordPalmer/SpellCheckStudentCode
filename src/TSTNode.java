public class TSTNode {
    private char letter;
    private TSTNode left;
    private TSTNode middle;
    private TSTNode right;
    private boolean isWord;

    public TSTNode(char letter){
        this.letter = letter;
        isWord = false;
    }

    public void addLeft(char letter){
        left = new TSTNode(letter);
    }
    public void addMiddle(char letter){
        middle = new TSTNode(letter);
    }
    public void addRight(char letter){
        right = new TSTNode(letter);
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public TSTNode getLeft() {
        return left;
    }

    public TSTNode getMiddle() {
        return middle;
    }

    public TSTNode getRight() {
        return right;
    }

    public char getLetter() {
        return letter;
    }
}
