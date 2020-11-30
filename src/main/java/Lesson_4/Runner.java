package Lesson_4;

public class Runner {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle ();
        triangle1.setSide_a(3);
        triangle1.setSide_b(4);
        triangle1.setSide_c(5);

        double result = triangle1.triangleSquare();
        System.out.println(result);
    }
}

