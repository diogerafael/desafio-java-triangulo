public class CalcularAreaTriangulo {
    // Area = (base * altura) / 2
    public float base;
    public float altura;
    public int divisor = 2;

    public void calcular(float number1, float number2){
        float area = number1 * number2 / divisor;
        System.out.println("Com uma de base: " +base+ " e de altura: " +altura+ " temos a area de um triangulo: " + area);
    }
}
