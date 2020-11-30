package Lesson_4;

public class Triangle {

    public static double a;
    public static double b;
    public static double c;

    public Triangle () {}

    public static double triangleSquare()
    {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void setSide_a (double a) {
        this.a = a;
    }

    public void setSide_b (double b) {
        this.b = b;
    }

    public void setSide_c (double c) {
        this.c = c;
    }

}

