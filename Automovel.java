import java.util.ArrayList;
import java.util.Scanner;

public class Automovel {
    private String marca;
    private String modelo;
    private int ano;
    private double valor;
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Automovel> automoveis = new ArrayList<>();

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

    public static void cadastrarAutomovel() {
        System.out.println("\nCadastrar veículo:");
        System.out.print("Digite a Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Digite o Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        Automovel automovel = new Automovel(marca, modelo, ano, valor);
        automoveis.add(automovel);
        System.out.println("Veículo cadastrado com sucesso!");
    }

    public static void visualizarAutomoveis() {
        if (automoveis.isEmpty()) {
            System.out.println("\nNenhum veículo cadastrado ainda.");
            return;
        }

        System.out.println("\nCarros cadastrados:");
        for (int i = 0; i < automoveis.size(); i++) {
            System.out.println((i + 1) + " - " + automoveis.get(i).getMarca() + " " + automoveis.get(i).getModelo());
        }

        System.out.print("Escolha o número do carro para visualizar as informações ou 0 para voltar: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        if (escolha > 0 && escolha <= automoveis.size()) {
            System.out.println("\nInformações do veículo escolhido:");
            automoveis.get(escolha - 1).exibirInformacoes();
        } else if (escolha != 0) {
            System.out.println("Número inválido. Retornando ao menu.");
        }
    }

    public static void excluirAutomovel() {
        if (automoveis.isEmpty()) {
            System.out.println("\nNenhum veículo cadastrado para excluir.");
            return;
        }

        System.out.println("\nCarros cadastrados:");
        for (int i = 0; i < automoveis.size(); i++) {
            System.out.println((i + 1) + " - " + automoveis.get(i).getMarca() + " " + automoveis.get(i).getModelo());
        }

        System.out.print("Escolha o número do carro que deseja excluir ou 0 para voltar: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha > 0 && escolha <= automoveis.size()) {
            Automovel removido = automoveis.remove(escolha - 1);
            System.out.println("Veículo " + removido.getMarca() + " " + removido.getModelo() + " excluído com sucesso!");
        } else if (escolha != 0) {
            System.out.println("Número inválido. Retornando ao menu.");
        }
    }
}
