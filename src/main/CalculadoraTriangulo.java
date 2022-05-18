package main;

public class CalculadoraTriangulo {
    //Area = (base * altura) / 2
    public float base;
    public float area;
    public float altura;
    public int divisor;

    public void calcular() {
        System.out.println("Um triangulo com uma base: " + this.base + " e altura de: " + this.altura + " tem uma area de: " + this.area );
    }

}
