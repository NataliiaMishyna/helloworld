package module7;

import java.util.Locale;

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}

class WordFreqCounter{
    public float countFreq(String phrase, String word){
        phrase = phrase.toLowerCase();
        word = word.toLowerCase();
        String[] masStr = phrase.split(" ");
        int kol = 0;
        for (int i = 0; i < masStr.length; i++){
            if (true == word.equals(masStr[i])){
                kol++;
            }
        }
        return (float) kol / masStr.length;
    }
}