package module7;

class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}

class ShortWordCounter {
    public int count(String phrase, int minLength) {
        String[] masStr = phrase.split(" ");
        int kol = 0;
        for (int i = 0; i < masStr.length; i++) {
            String str = masStr[i];

            if (str.length() <= minLength) {
                kol++;
            }
        }
        return kol;
    }
}