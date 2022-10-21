package module7;

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

class NameCounter{
    public int count(String text){
        String[] masText = text.split(" ");
        int res = 0;

        for (int i = 0; i < masText.length; i++) {
            if (masText[i].matches("[A-Z]{1}[a-z]{1}.*")) res++;
        }
        return res;
    }
}
