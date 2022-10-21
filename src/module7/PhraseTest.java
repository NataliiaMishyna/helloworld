package module7;
import java.util.Arrays;

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}

class Phrase {
    private final String[] words;
    //private String str = "";

    public Phrase(String[] words) {
        String[] words2 = new String[words.length];
        System.arraycopy(words,0, words2, 0, words.length);
        this.words = words2;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < words.length; i++) {
            str = str + " " + words[i];
        }

        return str;
    }
}