public class Carro {
    Motor motorInfo = new Motor();
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;

    void ligar(){
        System.out.println("O carro ligou...");
    }

    void acelerar(){
        System.out.println("O carro acelerou...");
    }

    void mostraInfo(){
        System.out.println("Informações do motor");
        System.out.println("O motor possui uma potencia de: " + motorInfo.potencia + " cavalos");
        System.out.println("O motor possui o tipo: " + motorInfo.tipo);
        System.out.println("---------------------------------------------");
        System.out.println("Informações do carro");
        System.out.println("A cor do carro e: " + cor);
        System.out.println("A marca do carro e: " + marca);
        System.out.println("O modelo do carro e: " + modelo);
        System.out.println("A velocidade maxima e: " + velocidadeMax + " Km/h");
        System.out.println("A velodidade atual em que se encontra o carro e de: " + velocidadeAtual + " Km/h");
    }

}
