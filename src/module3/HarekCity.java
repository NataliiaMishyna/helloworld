package module3;
import java.util.Arrays;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4){
        int [] mas = {age1, age2, age3, age4};
        return mas;
    }
    public void fixNames(String[] names, String[] toReplace){
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String [] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public String[] changeElectResult(String[] results){
        int lengthMas = results.length - 1;
       String firstName = results[0];
            String lastName = results[lengthMas];
            results[0] = lastName;
            results[lengthMas] = firstName;
            return results;
     }

     public String[] changeElectResultAgain(String[] results){
        String[] masThree = new String[3];
        masThree[0] = results[2];
        masThree[1] = results[3];
        masThree[2] = results[4];
        return masThree;
     }

    public char[][] createKeyboard(){
        char[][] charMas = new char[4][3];
        charMas[0][0] = '1'; charMas[0][1] = '2'; charMas[0][2] = '3';
        charMas[1][0] = '4'; charMas[1][1] = '5'; charMas[1][2] = '6';
        charMas[2][0] = '7'; charMas[2][1] = '8'; charMas[2][2] = '9';
        charMas[3][0] = '*'; charMas[3][1] = '0'; charMas[3][2] = '#';
        return charMas;
    }

    public void printKeyboard() {
        char[][] charMas = createKeyboard();
        System.out.println(Arrays.toString(charMas[0]));
        System.out.println(Arrays.toString(charMas[1]));
        System.out.println(Arrays.toString(charMas[2]));
        System.out.println(Arrays.toString(charMas[3]));
    }

    public String[] makeCopy(String[] names){
        String[] copyNames = Arrays.copyOf(names, names.length);
        return copyNames;
    }

    public static void main(String[] args) {
        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается
        System.out.println("Copied!");
        System.out.println(Arrays.toString(copy));
    }

}