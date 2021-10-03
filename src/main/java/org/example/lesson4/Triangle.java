package org.example.lesson4;

public class Triangle {

    public static double calculateTriangleSquare(int a,int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) throw new Exception();
        double halfPerimeter = (a + b + c) / 2;
        return (halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));

    }

}
