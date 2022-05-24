import java.util.Scanner;
public class Main {
    public static void main(String [] srgs){

        Scanner entrada=new Scanner(System.in);

        Triangulo t1 = new Triangulo();

        System.out.println("Digite a base:");
        t1.base=entrada.nextFloat();

        System.out.println("Digite a altura:");
        t1.altura=entrada.nextFloat();

        t1.calcularbasedotriangulo();
    }
}
