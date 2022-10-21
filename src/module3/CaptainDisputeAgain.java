package module3;

public class CaptainDisputeAgain {
    public int findMin(int[] triple) {
        int min;
        //max = d2 > d1 ? d2 : d1;
        //max = max > d3 ? max : d3;

        min = triple[0] < triple[1] ? triple[0] : triple[1];
        min = min < triple[2] ? min : triple[2];
        return min;
    }

    public static void main(String[] args) {

        CaptainDisputeAgain ship = new CaptainDisputeAgain();
        int mas = new CaptainDisputeAgain().findMin(new int[] {1, 10, 3});
        System.out.println(mas);
    }
}
