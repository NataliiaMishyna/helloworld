package module7;

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}

class PunctuationMarkCounter{
    public int count(String phrase){
        int i = 0;
        for (char el : phrase.toCharArray()){
            if (el == '.' || el == ',' || el == '!' || el == ':' || el == ';') i++;
        }
        return i;
    }
}