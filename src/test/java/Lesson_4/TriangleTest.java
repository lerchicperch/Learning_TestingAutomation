package Lesson_4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import  org.slf4j.Logger;
import  org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @BeforeAll
    static void setTestData ()
    {
        logger.debug("Some info for log");
        Triangle triangle = new Triangle ();
        triangle.setSide_a(TestData.TESTSIDE1_a);
        triangle.setSide_b(TestData.TESTSIDE1_b);
        triangle.setSide_c(TestData.TESTSIDE1_c);
        System.out.printf("Setpoints for triangle: %f, %f, %f", Triangle.a, Triangle.b, Triangle.c);
    }

    @Nested
    class ConditionExistenceTest {

        @Test
        @DisplayName("Positive value check")
        void nullSideCheck() {
            Assertions.assertAll(
                    () -> assertTrue(Triangle.a > 0),
                    () -> assertTrue(Triangle.b > 0),
                    () -> assertTrue(Triangle.c > 0)
            );
        }

        @Test
        @DisplayName("Side rule check")
        void ruleCheck() {
            assertTrue((Triangle.a + Triangle.b > Triangle.c) && (Triangle.a + Triangle.c > Triangle.b) && (Triangle.b + Triangle.c > Triangle.a));
        }
    }

    @Nested
    class TriangleSquareFunctionTest
    {
        @Test
        @DisplayName("Correct operation of the square function check")
        void squareCheck()
        {
            assertEquals(TestData.TESTRESULT1, Triangle.triangleSquare());
        }
    }

}
