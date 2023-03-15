public class Produto {
    int codigoSerie; // Codigo serie do produto
    String codigoProduto; // Codigo do produto
    String nome; // Nome do produto
    String categoria; // Categoria na qual o produto se encaixa
    int quantidade; // quantidade de unidades do produto

    //Mostra as informações do produto cadastrado
    void mostraInfo(){
        System.out.println("Codigo Serie do produto: " + codigoSerie);
        System.out.println("Codigo do produto: " + codigoProduto);
        System.out.println("Nome do produto: " + nome);
        System.out.println("Categoria do Produto: " + categoria);
        System.out.println("Qauntidade de unidades do produto: " + quantidade);
    }

}
