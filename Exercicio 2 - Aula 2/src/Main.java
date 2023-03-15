public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        Motor motor2 = new Motor();

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        //Atribuindo valores aos atributos do objeto
        motor1.potencia = 140;
        motor1.tipo = "Honda T1";

        carro1.cor = "Azul";
        carro1.marca = "Honda";
        carro1.modelo = "Civic";
        carro1.velocidadeMax = 250;
        carro1.velocidadeAtual = 100;

        motor2.potencia = 100;
        motor2.tipo = "Ford HP2";

        carro2.cor = "Branco";
        carro2.marca = "Ford";
        carro2.modelo = "Onix";
        carro2.velocidadeMax = 200;
        carro2.velocidadeAtual = 120;

        //Chamando os metodos
        carro1.ligar();
        carro1.acelerar();
        System.out.println(" ");
        carro1.mostraInfo();

        System.out.println(" ");
        carro2.ligar();
        carro2.acelerar();
        System.out.println(" ");
        carro2.mostraInfo();
    }
}