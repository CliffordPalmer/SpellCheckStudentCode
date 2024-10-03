public class TST {
    private TSTNode root;

    public TST(){
        root = new TSTNode('n');
    }

    public void insert(String s){
        TSTNode current = root;
        for(int character = 0; character < s.length(); character++) {
            if(current == null){

            }
            char currentLetter = current.getLetter();
            char testLetter = s.charAt(character);
            if(testLetter == currentLetter){
                if(current.getMiddle() == null){
                    current.addMiddle();
                }
            }

//            while (current.getLetter() != s.charAt(character)) {
//                if(s.charAt(character) < current.getLetter()){
//                    current = current.getLeft();
//                }
//                else if(s.charAt(character) > current.getLetter()){
//                    current = current.getLeft();
//                }
//                if(current == null){
//                    current = new TSTNode(s.charAt(character));
//                    break;
//                }
//            }
//            if(current.getLetter() == s.charAt(character)){
//                current = current.getMiddle();
//                if(current == null){
//                    current = new TSTNode(s.charAt(character));
//                }
//            }
        }
        current.setWord(true);
    }

    public boolean lookup(String s){
        TSTNode current = root;
        for(int character = 0; character < s.length(); character++){

        }
        if(current.isWord()){
            return true;
        }
        return false;
    }

}
