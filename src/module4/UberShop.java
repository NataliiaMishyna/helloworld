package module4;
import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        int length = prices.length;
        for (int i = 0; i < length; i++) {
            if (prices[i] < 1000f) {
                prices[i] = prices[i] * 2f;
            } else {
                prices[i] *= 1.5f;
            }

        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        int length = prices.length;
        int[] mas;
        int min;
        int max;
        if (length == 0) {
            mas = new int[0];
            return mas;
        } else {
            min = max = prices[0];
        }
        for (int i = 0; i < length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if (max < prices[i]) {
                max = prices[i];
            }
        }
        if (max == min) {
            mas = new int[1];
            mas[0] = max;
            return mas;
        } else {
            mas = new int[2];
            mas[0] = min;
            mas[1] = max;
        }
        return mas;
    }

    public int getMinPriceCount(int[] prices) {
        int min;
        int count = 0;
        int length = prices.length;
        if (length == 0) {
            return count;
        } else {
            min = prices[0];
        }
        for (int i = 1; i < length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        for (int price : prices) {
            if (price == min) {
                count = count + 1;
            }
        }
        return count;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int j = 0;
        int length = prices.length;
        for (int i = 0; i < length; i++){
            if (prices[i] == toRemove){
                j++;
            }
        }

        int[] mas = new int[length-j];
        j= 0;
        for (int i = 0; i < length; i++){
            if (prices[i] != toRemove){
                mas[j] = prices[i];
                j++;
            }
        }
        return mas;
    }

    public int[] leavePrice9(int[] prices){
        int j = 0;
        int length = prices.length;
        for (int price: prices){
            if (price%10 == 9){
                j++;
            }
        }

        int[] mas = new int[j];
        j= 0;
        for(int price: prices){
            if (price%10 == 9){
                mas[j] = price;
                j++;
            }
        }
        return mas;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] werehouseStocks){
        String [] mas;
        mas = new String[showcaseStocks.length + werehouseStocks.length];
        for (int i = 0; i < showcaseStocks.length; i++){
            mas[i] = showcaseStocks[i];
        }
        int j = showcaseStocks.length;
        for (int i= 0; i < werehouseStocks.length; i++){
            mas[j] = werehouseStocks[i];
            j++;
        }
        return mas;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int summa = 0;
        for (int price: prices){
            if (price >= minPrice & price <= maxPrice){
                summa += price;
            }
        }
        return summa;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}

