package module3;

import java.util.Arrays;

public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c) {
        int D = b * b - 4 * a * c;
        double[] mas = {};

        if (D < 0) {
            mas = new double[0];
        }

        if (D == 0) {
            mas = new double[1];
            mas[0] = (-1 * b) / (2 * a);
        }

        if (D > 0) {
            mas = new double[2];
            double x1 = (-1 * b + Math.sqrt(D)) / (2 * a);
            double x2 = (-1 * b - Math.sqrt(D)) / (2 * a);
            if (x1 > x2) {
                mas[0] = x1;
                mas[1] = x2;
            } else {
                mas[0] = x2;
                mas[1] = x1;
            }
        }
        return mas;
    }

    public static void main(String[] args) {

        QuadraticEquationSolver ship = new QuadraticEquationSolver();
        double[] mas = new QuadraticEquationSolver().solve(4, -56, 196);
        System.out.println(Arrays.toString(mas));

    }
}