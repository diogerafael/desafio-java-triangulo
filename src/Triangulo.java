public class Triangulo {
    private float area;
    public float base;
    public float altura;
    public void calcularbasedotriangulo(){
        area = ((base*altura)/2);
        System.out.println("Area do triangulo:"+ this.area);
    }

}
