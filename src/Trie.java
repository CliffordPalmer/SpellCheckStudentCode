public class Trie {
    // Stores the root node of this trie
    private Node root;

    public Trie(){
        root = new Node();
    }

    // Method for inserting words into the trie
    public void insert(String s){
        Node current = root;

        // Traverse the String letter by letter
        for(int character = 0; character < s.length(); character++){
            // Variable to reduce charAt calls
            int characterIndex = s.charAt(character);
            // If the referenced child is null, create a new node in its place
            if(current.getNext()[characterIndex] == null){
                Node toAdd = new Node();
                current.createNextWord(characterIndex, toAdd);
            }
            current = current.getNext()[characterIndex];
        }
        // At the end of the word, set the validity of the word to true
        current.setWord(true);

    }

    // Method for looking up Strings in the Trie
    public boolean lookup(String s){
        Node current = root;
        // Traverse the String letter by letter
        for(int character = 0; character < s.length(); character++){
            // Same as above
            int characterIndex = s.charAt(character);
            // Return false immediately if the child being referenced is null
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
