package main;

public abstract class FiguraGeometrica {
    protected final float base;
    protected final float altura;

    public FiguraGeometrica(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract float area();

}
