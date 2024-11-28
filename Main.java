public class Main {
    public static void main(String[] args) {
        Automovel carro = new Automovel("Toyota", 2020, 85000.00);

        carro.exibirInformacoes();

        carro.setMarca("Honda");
        carro.setAno(2022);
        carro.setValor(95000.00);

        System.out.println("\nInformações atualizadas:");
        carro.exibirInformacoes();
    }
}
