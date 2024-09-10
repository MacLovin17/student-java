import java.util.Scanner;

public class vetor {
    public static void main(String[]args){
        Scanner scanf = new Scanner(System.in);
        int[] vetorA = new int[5];
        int somatorio=0;
        for(int i=0; i<5; i++){
            System.out.println("Informe um numero:");
            vetorA[i]= scanf.nextInt();  
            somatorio+=vetorA[i];     
        }
            System.out.println("Somatorio dos valores do vetor é : " +somatorio);
            scanf.close();
    }
}
