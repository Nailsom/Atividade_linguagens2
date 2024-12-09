import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int opcao = obterOpcaoUsuario();

            switch (opcao) {
                case 1 -> Automovel.cadastrarAutomovel();
                case 2 -> Automovel.visualizarAutomoveis();
                case 3 -> Automovel.excluirAutomovel();
                case 4 -> sair();
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1 - Cadastrar carro");
        System.out.println("2 - Visualizar carros cadastrados");
        System.out.println("3 - Excluir um carro");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int obterOpcaoUsuario() {
        int opcao = new Scanner(System.in).nextInt();
        return opcao;
    }

    private static void sair() {
        System.out.println("Saindo do programa. Até mais!");
        System.exit(0);
    }
}
