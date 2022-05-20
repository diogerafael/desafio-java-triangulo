package main;

public class TrianguloEquilatero extends FiguraGeometrica {

    public TrianguloEquilatero(final float base, final float altura) throws Exception {
        super(base,altura);

        if(temValorNegativoOuZerado()){
            throw new Exception("Valores não podem ser menor ou igual a zero.");
        }

        if(naoEEquilatero()){
            throw new Exception("Os valores são diferentes");
        }
    }

    @Override
    public float area() {
        return (base * altura) / 2;
    }

    private boolean temValorNegativoOuZerado() {
        return base <= 0 || altura <= 0;
    }

    private boolean naoEEquilatero() {
        return base != altura;
    }

}
