public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.codigoSerie = 19231;
        produto1.codigoProduto = "Ab123V";
        produto1.nome = "Biscoito Maria";
        produto1.categoria = "Biscoito";
        produto1.quantidade = 20;

        produto2.codigoSerie = 97451;
        produto2.codigoProduto = "Acf234t";
        produto2.nome = "Leite Cooperita";
        produto2.categoria = "Laticinios";
        produto2.quantidade = 10;

        produto1.mostraInfo();
        System.out.println("");
        produto2.mostraInfo();
    }
}