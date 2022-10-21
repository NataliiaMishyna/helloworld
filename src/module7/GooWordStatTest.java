package module7;

class GooWordStatTest {
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("life", 564785654));
    }
}

class GooWordStat{
    private String word;
    private int freq;
    private String sFreq;
    public GooWordStat(String word, int freq){
        this.word = word;
        this.freq = freq;
        if (freq < 1000){
            sFreq = "Low";
        }
        if (freq >= 1000 && freq <100000){
            sFreq = "MEDIUM";
        }
        if (freq >=100000 && freq < 10000000){
            sFreq = "HIGH";
        }
        if (freq > 10000000){
            sFreq = "EXTRA HIGH";
        }
    }

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    @Override
    public String toString() {


        return "Word is [" + word + "], search freq is " + sFreq;
    }
}