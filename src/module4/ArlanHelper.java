package module4;

public class ArlanHelper {

    public String drawQuad(int n) {
        int i = 1;
        int j = 1;
        String line = "";
        String lineA = "";
        while (i <= n) {
            while (j <= n) {
                line = String.join("", line, "*");
                j++;
            }
            lineA = String.join("\n", lineA, line);
            i++;
        }
        return lineA;
    }

    public String drawRect(int width, int height, char c) {
        int i = 1;
        int j = 1;
        String line = "";
        String lineA = "";
        while (i <= height) {
            while (j <= width) {
                //line = String.join("", line, (CharSequence) c);
                line = line + c;
                j++;
            }
            lineA = String.join("\n", lineA, line);
            i++;
        }
        return lineA;
    }

    public String drawLine(int length){
        boolean iStar = true;
        String line = "";
        int i = length;
        while (i > 0){
            if (iStar == true){
                line = line + "*";
                iStar = false;
            }else{
                line += "#";
                iStar = true;
            }
            i--;
        }
         return line;
    }

    public String drawPattern(char[] pattern, int repeatCount){
        int j = 0;
        String line = "";
        while (repeatCount > 0){
            while (j < pattern.length){
                line += pattern[j];
                j++;
            }
            repeatCount--;
            j=0;
        }
        return line;
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
