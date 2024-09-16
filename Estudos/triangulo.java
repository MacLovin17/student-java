package Estudos;
import java.util.Scanner;

public class triangulo {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do trinângulo:");
        float base = scanner.nextFloat();
        System.out.println("Informe a altura do triângulo:");
        float altura = scanner.nextFloat();

        float area = (base*altura)/2;

        System.out.println("Base é = " +base);
        System.out.println("Altura é = " +altura);
        System.out.println("Area do triângulo é = " +area);
        
        scanner.close();
    }
}
