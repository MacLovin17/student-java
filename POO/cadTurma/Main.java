import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        turma[] myturma = new turma[3];
        

        for(int i = 0; i<3; i++){
            myturma[i] = new turma();

            System.out.println("Informe a primeira turma");
                myturma[i].classe = scanf.nextLine();
            System.out.println("Informe a serie da turma");
                myturma[i].serie = scanf.nextInt();
                scanf.nextLine();
                
                for(int y=0; y<3; y++){
                    myturma[i].aluno[y] = new alunos();
                    System.out.println("Informe o nome do aluno "+(y+1)+":");
                        myturma[i].aluno[y].nome = scanf.nextLine();
                }    
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Turma: " + myturma[i].classe + ", Série: " + myturma[i].serie);
            for (int y = 0; y < 3; y++) {
                System.out.println("Aluno " + (y + 1) + ": " + myturma[i].aluno[y].nome);
            }
        }

        scanf.close();
    }
}