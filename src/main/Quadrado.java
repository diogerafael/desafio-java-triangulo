package main;

public class Quadrado extends FiguraGeometrica {

    public Quadrado(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float area() {
        return base * altura;
    }
}
