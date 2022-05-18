package main;

public class Main {
    public static void main(String[] args) {
        CalculadoraTriangulo t1 = new CalculadoraTriangulo();

        t1.base = 2.75F;
        t1.altura = 3.62F;
        t1.divisor = 2;
        t1.area = t1.base * t1.altura / t1.divisor;

        t1.calcular();
    }
}
