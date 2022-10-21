package module7;
import java.util.Arrays;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter{
    public int[] extract(String text){
        text = text.replaceAll(",","");
        char characters[] = text.toCharArray();
        //String[] masStr = text.split(" ");
        int[] masResult = new int[characters.length];
        int j = 0;

        for (int i = 0; i < characters.length; i++) {
            if (isDigit(characters[i])) {
                masResult[j] = Integer.parseInt(String.valueOf(characters[i]));
                j++;
            }
        }
        int[] mRes = new int[j];
        System.arraycopy(masResult, 0, mRes, 0, j);
        return mRes;
    }

    public boolean isDigit(char c){
        return Character.isDigit(c);
    }
}