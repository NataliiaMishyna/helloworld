package module7;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall{
    public String calculate(String text){
        text = text.replaceAll(" ", "");
        char masCh[] = text.toCharArray();
        String res = "";
        int countLowerCase = 0;
        int countUpperCase = 0;

        for (int i = 0; i < masCh.length; i++) {
            if(isLowerCase(masCh[i])){
                countLowerCase++;
            }
            if (isUpperCase(masCh[i])){
                countUpperCase++;
            }
        }

        if(countUpperCase > countLowerCase) res = "Big";
        if(countLowerCase > countUpperCase) res = "Small";
        if(countLowerCase == countUpperCase) res = "Same";

        return res;
    }

    public boolean isLowerCase(char c){
        return Character.isLowerCase(c);
    }

    public boolean isUpperCase(char c){
        return Character.isUpperCase(c);
    }
}
