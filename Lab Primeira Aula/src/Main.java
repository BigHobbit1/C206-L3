import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float imc;

        System.out.println("Insira os dados para analisarmos o seu IMC");
        System.out.println("Insira o seu peso");
        Scanner dado1 = new Scanner(System.in);
        float peso = dado1.nextFloat();
        System.out.println("Insira sua altura");
        float altura = dado1.nextFloat();
        dado1.close();

        imc = (peso/(altura*altura));

        if(imc<=18.5)
            System.out.println("IMC: Abaixo do peso");
        else if (imc>18.5 && imc<25)
            System.out.println("IMC: Peso ideal(Parabens)");
        else if (imc>=25 && imc<30)
            System.out.println("Levemente acima do peso");
        else if (imc>=30 && imc<35)
            System.out.println("Obesidade grau I");
        else if (imc>=35 && imc<40)
            System.out.println("Obesidade grau II (severa)");
        else
            System.out.println("Obesidade grau III (mórbida)");
    }
}