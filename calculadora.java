import java.util.Scanner;

public class calculadora{
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int num1 = scanf.nextInt();
        System.out.println("Informe o seugndo numero:");
        int num2 = scanf.nextInt();
        System.out.println("Escolha uma operação:");
        System.out.println("+, -, *, /");
        char op=scanf.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
            break;
            case '*':
                System.out.println(num1*num2);
            break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                }
            break;
            default:
                System.err.println("Insira um operador correto! ");
                break;
        }
        scanf.close();

    }
}