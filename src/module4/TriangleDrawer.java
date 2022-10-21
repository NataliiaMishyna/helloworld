package module4;

public class TriangleDrawer {

    public String drawTriangle(int side){
        String line = "*";
        String lineA = "";
        while (side > 0){
            line = line.repeat(side);
            side--;
            lineA = String.join("\n", lineA, line);
            line = "*";
        }
        return lineA;
    }

    public static void main(String[] args) {
        TriangleDrawer drawer = new TriangleDrawer();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(drawer.drawTriangle(5));
    }
}
