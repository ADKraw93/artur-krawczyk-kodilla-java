package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for creating figures method")
    class TestCreateFigure{
        @Test
        void testCreateCircle() {
            //Given
            var circle = new Circle(10.2);

            //When
            var circleField = circle.field();

            //Then
            Assertions.assertEquals(10.2, circleField);
        }

        @Test
        void testCreateSquare() {
            //Given
            var square = new Square(10.2);

            //When
            var squareField = square.field();

            //Then
            Assertions.assertEquals(10.2, squareField);
        }

        @Test
        void testCreateTriangle() {
            //Given
            var triangle = new Triangle(10.2);

            //When
            var triangleField = triangle.field();

            //Then
            Assertions.assertEquals(10.2, triangleField);
        }
    }

    @Nested
    @DisplayName("Tests for addFigure method")
    class TestAddFigure{
        @Test
        void testAddCircle() {
            //Given
            var shapeCollector = new ShapeCollector();
            var figure = new Circle(5.5);

            //When
            shapeCollector.addFigure(figure);

            //Then
            Assertions.assertEquals(1, shapeCollector.getList().size());
        }

        @Test
        void testAddSquare() {
            //Given
            var shapeCollector = new ShapeCollector();
            var figure = new Square(2.3);

            //When
            shapeCollector.addFigure(figure);

            //Then
            Assertions.assertEquals(1, shapeCollector.getList().size());
        }

        @Test
        void testAddTriangle() {
            //Given
            var shapeCollector = new ShapeCollector();
            var figure = new Triangle(3.2);

            //When
            shapeCollector.addFigure(figure);

            //Then
            Assertions.assertEquals(1, shapeCollector.getList().size());
        }

        @Test
        void testAddMany() {
            //Given
            var shapeCollector = new ShapeCollector();
            var circle = new Circle(3.2);
            var square = new Square(3.2);
            var triangle = new Triangle(3.2);

            //When
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(3, shapeCollector.getList().size());
        }
    }

    @Nested
    @DisplayName("Tests for removeFigure method")
    class TestRemoveFigure{
        @Test
        void testRemoveWrongFigure() {
            //Given
            var shapeCollector = new ShapeCollector();
            var circle = new Circle(5.5);
            var square = new Square(3.2);

            //When
            shapeCollector.addFigure(circle);
            shapeCollector.removeFigure(square);

            //Then
            Assertions.assertEquals(1, shapeCollector.getList().size());
        }

        @Test
        void testRemoveAppropriateFigure() {
            //Given
            var shapeCollector = new ShapeCollector();
            var circle = new Circle(5.5);

            //When
            shapeCollector.addFigure(circle);
            shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertEquals(0, shapeCollector.getList().size());
        }
    }

    @Nested
    @DisplayName("Tests for getFigure method")
    class TestGetFigure{
        @Test
        void testGetFigure() {
            //Given
            var shapeCollector = new ShapeCollector();
            var circle = new Circle(5.5);
            Shape figure;

            //When
            shapeCollector.addFigure(circle);
            figure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(circle, figure);
        }
    }

    @Nested
    @DisplayName("Tests for showFigure method")
    class TestShowFigure{
        @Test
        void testShowFigure() {
            //Given
            var shapeCollector = new ShapeCollector();
            var circle = new Circle(3.2);
            var square = new Square(3.2);
            var triangle = new Triangle(3.2);

            //When
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("Circle, Square, Triangle", result);
        }
    }
}
