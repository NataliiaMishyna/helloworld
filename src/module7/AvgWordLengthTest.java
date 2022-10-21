package module7;

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength{
    public double count(String phrase){
        String[] masStr = new String[]{};
        masStr = phrase.split(" ");
        int sumBukv = 0;
        for (int i = 0; i < masStr.length; i++) {
            sumBukv += masStr[i].length();
        }
        return (double) sumBukv / masStr.length;
    }
}
