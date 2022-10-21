package module3;

public class NumberTranslator {


    public int translate(String romanNumber) {
        int chislo;
        romanNumber = romanNumber.replace(" ", "");
        romanNumber = romanNumber.toUpperCase();

        switch (romanNumber) {
            case "I":
                chislo = 1;
                break;
            case "II":
                chislo = 2;
                break;
            case "III":
                chislo = 3;
                break;
            case "IV":
                chislo = 4;
                break;
            case "V":
                chislo = 5;
                break;
            case "VI":
                chislo = 6;
                break;
            case "VII":
                chislo = 7;
                break;
            case "VIII":
                chislo = 8;
                break;
            case "IX":
                chislo = 9;
                break;
            case "X":
                chislo = 10;
                break;
            case "XI":
                chislo = 11;
                break;
            default:
                chislo = 12;
        }
        return chislo;
    }

    public static void main(String[] args) {

        NumberTranslator ship = new NumberTranslator();
        int chislo = new NumberTranslator().translate(" X i");
        System.out.println(chislo);
    }
}
