package module4;

public class TrurlBank {

    public int sumQuads(int n){
        int summaQ = 0;
        while (n > 0){
            summaQ += n * n;
            n--;
        }
        return summaQ;
    }

    public int countSumOfDigits(int number){
        int summa = 0;
        int i = 0;
        while (number > 0){
            i = number%10;
            number = number / 10;
            summa += i;
        }
        return summa;
    }


    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}
