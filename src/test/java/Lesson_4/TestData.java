package Lesson_4;

public class TestData {

    // позитивный тест
    public static double TESTSIDE1_a = 3;
    public static double TESTSIDE1_b = 4;
    public static double TESTSIDE1_c = 5;
    public static double TESTRESULT1 = 6;

    // негативный тест (сторона <= 0)
    public static double TESTSIDE2_a = 0;
    public static double TESTSIDE2_b = 0;
    public static double TESTSIDE2_c = 1;

    // негативный тест (нарушено правило существования треугольника)
    public static double TESTSIDE3_a = 4;
    public static double TESTSIDE3_b = 5;
    public static double TESTSIDE3_c = 10;

}
