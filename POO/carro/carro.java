package POO;

import java.util.Scanner;

public class carro {
    String  marca,
            fabricante;
    int ano;
    float valor;
    public static void main(String []args){
        Scanner scanf = new Scanner(System.in);

        carro[] meuCarro = new carro[3];

        for(int i =0; i < meuCarro.length; i++){

            meuCarro[i] = new carro();

            System.out.println("Informe o nome da marca do seu veículo:");
            meuCarro[i].marca = scanf.nextLine();
            System.out.println("Informe o nome do fabricante do seu veículo:");
            meuCarro[i].fabricante = scanf.nextLine();
            System.out.println("Informe o ano de fabricação do seu veículo:");
            meuCarro[i].ano = scanf.nextInt();
            System.out.println("Informe o valor de venda do seu veículo:");
            meuCarro[i].valor = scanf.nextFloat();

            scanf.nextLine();
        }

        
        for(int i =0; i < meuCarro.length; i++){

            System.out.println("Carro: "+i);
            System.out.println("Marca: "+meuCarro[i].marca);
            System.out.println("Fabricante: "+meuCarro[i].fabricante);
            System.out.println("Ano: "+meuCarro[i].ano);
            System.out.println("Valor: R$ "+meuCarro[i].valor);
        }



        scanf.close();
    } 
}
