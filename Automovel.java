public class Automovel {
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    public Automovel(String marca, String modelo, int ano, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: R$" + valor);
    }
}
