package main;

public class Main {
    public static void main(String[] args) throws Exception {
        FiguraGeometrica quadrado = new Quadrado(2,2);

        FiguraGeometrica triangulo = new TrianguloEquilatero(8, 8);
        new CalculadoraFiguraGeometrica().calculaArea(quadrado);
    }
}
// resolver com interfaces e polimorfismo
// herança, vantagens e desvantagens...