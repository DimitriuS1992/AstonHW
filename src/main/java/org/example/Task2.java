package org.example;

public class Task2 {

    interface Shape {

        default double getPerimeter() {
            return 0;
        }

        default double getArea() {
            return 0;
        }


        String getFillColor();
        String getBorderColor();
    }


    static class Circle implements Shape {
        private final double radius;
        private final String fillColor;
        private final String borderColor;


        public Circle(double radius, String fillColor, String borderColor) {
            this.radius = radius;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }


        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }


        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }


        @Override
        public String getFillColor() {
            return fillColor;
        }

        @Override
        public String getBorderColor() {
            return borderColor;
        }
    }


    static class Rectangle implements Shape {
        private final double width;
        private final double height;
        private final String fillColor;
        private final String borderColor;


        public Rectangle(double width, double height, String fillColor, String borderColor) {
            this.width = width;
            this.height = height;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }


        @Override
        public double getPerimeter() {
            return 2 * (width + height);
        }


        @Override
        public double getArea() {
            return width * height;
        }


        @Override
        public String getFillColor() {
            return fillColor;
        }

        @Override
        public String getBorderColor() {
            return borderColor;
        }
    }


    static class Triangle implements Shape {
        private final double side1;
        private final double side2;
        private final double side3;
        private final String fillColor;
        private final String borderColor;


        public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }


        @Override
        public double getPerimeter() {
            return side1 + side2 + side3;
        }


        @Override
        public double getArea() {
            double p = getPerimeter() / 2;
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }


        @Override
        public String getFillColor() {
            return fillColor;
        }

        @Override
        public String getBorderColor() {
            return borderColor;
        }
    }


        public static void main(String[] args) {

            Circle circle = new Circle(15, "Красный", "Черный");
            Rectangle rectangle = new Rectangle(5, 7, "Синий", "Белый");
            Triangle triangle = new Triangle(5, 8, 6, "Зеленый", "Желтый");


            printShapeInfo(circle);
            printShapeInfo(rectangle);
            printShapeInfo(triangle);
        }


        public static void printShapeInfo(Shape shape) {
            System.out.println("Периметр: " + shape.getPerimeter());
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Цвет заливки: " + shape.getFillColor());
            System.out.println("Цвет границ: " + shape.getBorderColor());
            System.out.println();
        }
    }

