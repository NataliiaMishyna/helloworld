package module7;

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("This is name", new String[] {"is"}));

        //This Sparta
        //System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}

class WordDeleter{
    public String remove(String phrase, String[] words){
        String res = phrase;
        for (int i = 0; i < words.length; i++){
            String s = "\\b" + words[i].trim() +"\\b";
            res = res.replaceAll(s, "");
        }
        return res.replaceAll("  ", " ").trim();
    }
}