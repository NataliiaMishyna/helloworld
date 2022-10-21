package module7;

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

class PalindromeCounter{
    public int count(String phrase){
        phrase = phrase.toLowerCase();
        String[] masStr = phrase.split(" ");
        int kol = 0;
        for (int i = 0; i < masStr.length; i++) {
            String str = masStr[i];

            if(str.equals(new StringBuilder(str).reverse().toString())) {
                kol++;
            }
        }
        return kol;
    }
}
