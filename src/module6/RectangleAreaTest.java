package module6;

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {0, -35, -17, -24};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea{
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public RectangleArea(int[] coords){
        this.startX = coords[0];
        this.startY = coords[1];
        this.endX = coords[2];
        this.endY = coords[3];
    }

    public int getArea(){
        int x = 0;
        int y = 0;
        if (endX > startX){
            x = endX - startX;
        }else{
            x = startX - endX;
        }
        if (endY > startY){
            y = endY - startY;
        }else{
            y = startY - endY;
        }

        return x * y;
        //(int) ((Math.pow((endX - startX), 2) + Math.pow((endY - startY), 2)))/2;
    }
}
