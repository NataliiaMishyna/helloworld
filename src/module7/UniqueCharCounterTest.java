package module7;

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("B n qq"));

        //4
        //System.out.println(charCounter.count("ab100"));

        //3
        //System.out.println(charCounter.count("Java"));
    }
}

class UniqueCharCounter{
    public int count(String phrase){
        phrase = phrase.toLowerCase();
        char characters[] = phrase.toCharArray();
        int sumKol = 0;
        int kol = 0;
        for (int i = 0; i < characters.length; i++) {
            sumKol++;
            for(int j = i+1; j< characters.length; j++){
                if (characters[j] == characters[i]) {
                    kol++;
                    break;
                }
            }
        }
        return sumKol - kol;

    }
}