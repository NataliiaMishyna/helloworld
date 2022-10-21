package module7;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("mdnma", "NAM"));

        //true
        //System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        //System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine{
    public boolean canCombine(String sourceWord, String targetWord){
        sourceWord = sourceWord.toLowerCase();
        targetWord = targetWord.toLowerCase();
        //char masSourceWors[] = sourceWord.toCharArray();
        char masTargetWord[] = targetWord.toCharArray();
        int resInt = 1;
        boolean result = false;

        for (int i = 0; i < masTargetWord.length; i++) {
            resInt = sourceWord.indexOf(masTargetWord[i]);
        }
        if(resInt >= 0){
            result = true;
        }
        return result;
    }
}