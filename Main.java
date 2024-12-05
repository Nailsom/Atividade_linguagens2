import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Automovel> automoveis = new ArrayList<>(); // Lista para armazenar os automóveis

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Visualizar carros cadastrados");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("\nCadastrar veículo:");
                    System.out.print("Digite a Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Digite o Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir quebra de linha

                    Automovel automovel = new Automovel(marca, modelo, ano, valor);
                    automoveis.add(automovel); // Adiciona o automóvel à lista
                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    if (automoveis.isEmpty()) {
                        System.out.println("\nNenhum veículo cadastrado ainda.");
                    } else {
                        System.out.println("\nCarros cadastrados:");
                        for (int i = 0; i < automoveis.size(); i++) {
                            System.out.println((i + 1) + " - " + automoveis.get(i).getMarca() + " " + automoveis.get(i).getModelo());
                        }
                        System.out.print("Escolha o número do carro para visualizar as informações: ");
                        int escolha = scanner.nextInt();
                        scanner.nextLine(); // Consumir quebra de linha

                        if (escolha > 0 && escolha <= automoveis.size()) {
                            System.out.println("\nInformações do veículo escolhido:");
                            automoveis.get(escolha - 1).exibirInformacoes();
                        } else {
                            System.out.println("Número inválido. Tente novamente.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa. Até mais!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
