public class Trie {
    private Node root;
    public Trie(){
        root = new Node();
    }
    public void insert(String s){
        Node current = root;
        for(int character = 0; character < s.length(); character++){
            int characterIndex = s.charAt(character);
            if(current.getNext()[characterIndex] == null){
                Node toAdd = new Node();
                current.createNextWord(characterIndex, toAdd);
            }
            current = current.getNext()[characterIndex];
        }
        current.setWord(true);

    }
    public boolean lookup(String s){
        Node current = root;
        for(int character = 0; character < s.length(); character++){
            int characterIndex = s.charAt(character);
            if(current.getNext()[characterIndex] == null){
                return false;
            }
            current = current.getNext()[characterIndex];
        }
        if(current.isWord()){
            return true;
        }
        return false;
    }
}
