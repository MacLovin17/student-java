import java.util.Scanner;

public class Matrix {
    private static final int I = 3;
    private static final int J = 4;
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        
        float[][] matrix = new float[I][J];
        float media = 0.0f;
        int soma_p = 0, soma_i = 0;

        for(int i=0; i < I; i++){
            for(int j=0; j < J; j++){
                System.out.println("Informe um numero.");
                matrix[i][j]= scanf.nextFloat();

                if (matrix[i][j] % 2 ==0) {
                    soma_p++;
                }
                else{
                    soma_i+= matrix[i][j];
                }
                media += matrix[i][j];
            }
        }

        for(int i=0; i < I; i++){
            for(int j=0; j < J; j++){
                System.out.println("Matrix [" +i+"]["+j+"]"+ "= " + matrix[i][j]);
            }
        }
        media = media/12;
        System.out.println("Quantidade de numeros pares: " +soma_p);
        System.out.println("Soma dos elementos ímpares: " +soma_i);
        System.out.println("A média de todos elemtentos: " +media);
        scanf.close();
    }
}
