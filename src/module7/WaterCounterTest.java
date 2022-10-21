package module7;

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}

class WaterCounter{
    public double count(String text){
        char mas[] = text.toCharArray();
        int kolP = 0;

        for (int i = 0; i < mas.length; i++) {
            if (isWhitespace(mas[i])) kolP++;
        }

        return (double) kolP / (mas.length);
    }

    public boolean isWhitespace(char c){
        return Character.isWhitespace(c);
    }
}
