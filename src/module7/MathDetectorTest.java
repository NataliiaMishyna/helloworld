package module7;

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}

class MathDetector{
    public boolean isMath(String text){
        //return text.matches("[^a-zA-Z][^\\s][^a-zA-Z][^\\s][^a-zA-Z]");
        //boolean result = false;
        //if(text.contains("p") || text.contains("+-*/")){
        //    result = true;
        //}
        return text.contains("=") || text.contains("+") || text.contains("-") || text.contains("*") || text.contains("/") || text.matches("\\d+");
    }
}
