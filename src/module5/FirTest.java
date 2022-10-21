package module5;

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 9));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum{
    @Override
    public int calc(int n){
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial extends FirNum{
    @Override
    public int calc(int n){
        int factorial = 1;
        for (int i = 1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }
}

class FirNumMultiplyOdd extends FirNum{
    @Override
    public int calc(int n){
        int dobutok = 1;
        for (int i = 1; i<=n; i++){
            if(i%2 != 0){
                dobutok *= i;
            }
        }
        return dobutok;
    }
}
class FirNumFizzBuzz extends FirNum{
    @Override
    public int calc(int n){
        int sum = 0;
        //3, 5, 6, 9, 10, 12, 18, 20
        for (int i = 1; i<=n; i++){
            if ((i%3 == 0 || i%5 ==0) && !(i%3 == 0 && i%5 ==0)){
                sum += i;
            }
        }
        return sum;
    }
}

class FirNumBasis extends FirNum{
    @Override
    public int calc(int n){
        int sum = 0;
        //3, 5, 6, 9, 10, 12, 18, 20
        for (int i = 1; i<=n; i++){
            if (i%2 == 0){
                sum += i;
            }
        }
        return sum/2;
    }
}