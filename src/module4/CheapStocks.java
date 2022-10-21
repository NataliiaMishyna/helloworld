package module4;

public class CheapStocks {

    public String getCheapStocks(String[] stocks){
        String nameStock = "";
        for (int i = 0; i < stocks.length; i++){
            String name = stocks[i];
            String[] mas = name.split(" ");
            int cinaInt = Integer.parseInt(mas[1]);
            if (cinaInt < 200) {
                nameStock = String.join(" ", nameStock, mas[0]);
            }
        }
        return nameStock;
    }


    public static void main(String[] args){
        CheapStocks stock = new CheapStocks();

        String [] stocks = {"gun 500", "firebow 70", "pixboom 200"};
        String name = stock.getCheapStocks(stocks);
        System.out.println(name);
    }
}
