package module8;

public class ShapeTest {
    public static void main(String[] args){
        Shape circle = new Circle();
        circle.printName();

        Shape quad = new Quad();
        quad.printName();

        Shape oval = new Oval();
        oval.printName();

        Shape trapeze = new Trapeze();
        trapeze.printName();

        Shape triangle = new Triangle();
        triangle.printName();
    }
}
