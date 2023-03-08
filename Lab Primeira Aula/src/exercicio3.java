import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner senha = new Scanner(System.in);

        System.out.println("Digite a senha:");
        int senhaDigitada = senha.nextInt();

        while(senhaDigitada!=2002){
            System.out.println("Senha Invalida");
            senhaDigitada = senha.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
