package module7;

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("hine@wu c"));

        //false
        //System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}

class EmailDetector{
    public boolean isPresent(String text){
        String[] masText = text.split(" ");
        boolean res = false;

        for (int i = 0; i < masText.length; i++) {
            if (masText[i].matches(".{2}([^@]*@).{2}")) res = true;
        }
        return res;
    }
}
