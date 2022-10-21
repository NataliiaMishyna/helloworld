package module4;

public class ATM {

    public int countBanknotes(int sum){
        int count = 0;
        int i = 0;
        int[] mas = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        while (sum > 0){
            count += sum / mas[i];
            sum = sum % mas[i];
            i++;
         }
        return count;
    }

    public static void main(String[] args) {
        ATM bank = new ATM();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countBanknotes(547));
    }

}
