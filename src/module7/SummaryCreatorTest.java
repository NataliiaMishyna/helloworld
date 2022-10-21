package module7;

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        //String shortPhrase = "Mars";
        //System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "zerysylugopuvat u";
        System.out.println(summaryCreator.create(longPhrase));
    }
}

class SummaryCreator{
    public String create(String text){
        String result = "";
        String probel = " ";
        if(text.length() > 15){
            result = text.substring(0, 15);
            if(!text.substring(15, 16).matches("^[\\s]")){
                result = result + "...";
            }
        }else{
            result = text;
        }
        return result;
    }
}
