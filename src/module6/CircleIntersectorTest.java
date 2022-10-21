package module6;

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(-7, 0, 9, 5, 0, 2));

        //not intersects
        //System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        //System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}

class CircleIntersector{
    private boolean da = false;
    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2){
        int x = 0;
        int y = 0;

        if(x2 > x1){
            x = x2 - x1;
        }else{
            x = x1 - x2;
        }

        if(y2 > y1){
            y = y2 - y1;
        }else{
            y = y1 - y2;
        }

        int distance = (int) Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
        if(distance <= r1 + r2) {
            da = true;
        }else{
            da = false;
        }
    }

    @Override
    public String toString() {
        if(da == true){
            return "intersects";
        }
        return "not intersects";
    }
}
