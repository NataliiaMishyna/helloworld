package module7;

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("kypusa poomzeyh jiniqyde vexufo login"));
    }
}

class SensitiveDataSearcher{
    public boolean isSensitiveDataPresent(String phrase){
        String[] words = {"pass","key","login","email"};
        String res = phrase.toLowerCase();
        int lRes = res.length();
        boolean result = false;
        for (int i = 0; i < words.length; i++){
            String s = "\\b" + words[i].trim() +"\\b";
            res = res.replaceAll(s, "");
        }
        if (lRes != res.length()){
            result = true;
        }
        return result;
    }
}