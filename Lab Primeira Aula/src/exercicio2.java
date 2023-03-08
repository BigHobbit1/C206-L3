import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {

        System.out.println("Bem vindo a sua calculadora digital");
        System.out.println("Digite o primeiro número para a operação");

        Scanner numero = new Scanner(System.in);
        float numero1 = numero.nextFloat();

        System.out.println("Digite o segundo número para a operação");
        float numero2 = numero.nextFloat();

        System.out.println("Digite a operação desejada de acordo com os seguintes simbolos:");
        System.out.println("+ Soma !! - Subtração !! / Divisão !! e Exponencial");
        String op1 = numero.next();
        char op2 = op1.charAt(0);
        numero.close();

        float conta;
        switch (op2){
            case '+':
                conta = numero1+numero2;
                System.out.println("Resultado da conta: ");
                System.out.print(conta);
                break;
            case '-':
                conta = numero1-numero2;
                System.out.println("Resultado da conta: ");
                System.out.print(conta);
                break;
            case '/':
                conta = numero1/numero2;
                System.out.println("Resultado da conta: ");
                System.out.print(conta);
                break;
            case 'e':
                conta = (float)Math.pow(numero1,numero2);
                System.out.println("Resultado da conta: ");
                System.out.print(conta);
                break;
            default:
                System.out.println("Não foi possivel realizar a conta");
        }
    }
}
