package dev.metehan;

public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public double calculateCircleArea(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }
}
