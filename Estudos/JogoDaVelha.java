package Estudos;
import java.util.Scanner;

public class JogoDaVelha {

    public static char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void imprimir(){
        System.out.println(" |\t0\t|\t1\t|\t2");
        System.out.println("************************************************");
        System.out.println("0|\t\t|\t \t|\t ");
        System.out.println("************************************************");
        System.out.println("1|\t\t|\t \t|\t ");
        System.out.println("************************************************");
        System.out.println("2|\t\t|\t \t|\t ");
    };

    public static void atual(){
        System.out.println("["+tabuleiro[0][0]+"]["+tabuleiro[0][1]+"]["+tabuleiro[0][2]+"]");
        System.out.println("["+tabuleiro[1][0]+"]["+tabuleiro[1][1]+"]["+tabuleiro[1][2]+"]");
        System.out.println("["+tabuleiro[2][0]+"]["+tabuleiro[2][1]+"]["+tabuleiro[2][2]+"]");
    };
    public static void main(String[]args){
        Scanner scanf = new Scanner(System.in);
        int opc_i = 0, opc_j =0;
        
        imprimir();

        for(int i = 0; i < 9; i++){
            opc_i = 0; 
            opc_j =0;
            
                if (i %2 == 0 || i==0) {
                    
                    System.out.println("Jogador X esolha uma linha:");
                    opc_i = scanf.nextInt();
                    System.out.println("Jogador X esolha uma Coluna:");
                    opc_j = scanf.nextInt();
                    if(tabuleiro[opc_i][opc_j] == ' '){
                        tabuleiro[opc_i][opc_j]= 'X';
                    }
                    else{
                        while (tabuleiro[opc_i][opc_j] != ' ') {
                            System.err.println("Essa posição já esta oculpada, insira outro local.");
                            System.out.println("Jogador X escolha uma linha:");
                            opc_i = scanf.nextInt();
                            System.out.println("Jogador X escolha uma Coluna:");
                            opc_j = scanf.nextInt();
                        }
                        tabuleiro[opc_i][opc_j]= 'X';
                    }
                    
                }
                else{
                    System.out.println("Jogador O escolha uma linha:");
                    opc_i = scanf.nextInt();
                    System.out.println("Jogador O escolha uma Coluna:");
                    opc_j = scanf.nextInt();
    
                    if(tabuleiro[opc_i][opc_j] == ' '){
                        tabuleiro[opc_i][opc_j]= 'O';
                    }
                    else{
                        while (tabuleiro[opc_i][opc_j] != ' ') {
                            System.err.println("Essa posição já esta oculpada, insira outro local.");
                            System.out.println("Jogador O escolha uma linha:");
                            opc_i = scanf.nextInt();
                            System.out.println("Jogador O escolha uma Coluna:");
                            opc_j = scanf.nextInt();
                        }
                        tabuleiro[opc_i][opc_j]= 'O';
                    }
                }
            
                atual();
            
            
            if (i >= 4) {
                if (tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2] 
                 || tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]
                 || tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]
                 || tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2]
                 || tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2]
                 || tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[0][0] == tabuleiro[2][0]  
                 || tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][1]
                 || tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[2][2] == tabuleiro[1][2]) {
                    System.out.println("GANHOU!!!!");
                    break;
                }
            }
            if (i == 8) {
                System.out.println("VELHA!!!!!");
                break;
            }
        }
        
        
        scanf.close();
    }
   
}
