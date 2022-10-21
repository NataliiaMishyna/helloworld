package module7;
import java.util.Arrays;

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}

class WordSplitter{
    public String[] split(String phrase){
        String str = "";
        str = phrase.toLowerCase();
        str = str.replaceAll("\\s+", " ");
        return str.split(" ");
    }
}
