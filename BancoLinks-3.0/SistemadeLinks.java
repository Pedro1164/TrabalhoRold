import java.util.ArrayList;
import java.util.Scanner;

public class SistemadeLinks {
    private ArrayList<Link> links;

    public SistemadeLinks() {
        links = new ArrayList<>();
    }

    // Método para adicionar um link
    public void adicionarLink() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("==Adicionar Link==");
            System.out.print("Digite a URL: ");
            String url = scanner.nextLine();

            System.out.print("Digite a descrição: ");
            String descricao = scanner.nextLine();

            System.out.print("Digite a categoria: ");
            String categoria = scanner.nextLine();

            Link link = new Link(url, descricao, categoria);
            links.add(link);
            System.out.println("Link adicionado com sucesso!\n");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Método para listar todos os links
    public void listarLinks() {
        if (links.isEmpty()) {
            System.out.println("Nenhum link foi encontrado.\n");
        } else {
            System.out.println("Links cadastrados:");
            for (int i = 0; i < links.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + links.get(i));
                System.out.println("--------------------------");
            }
        }
    }

    // Novo método para filtrar links por categoria
    public void filtrarLinksPorCategoria() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a categoria para filtrar os links: ");
        String categoriaFiltro = scanner.nextLine();

        boolean encontrado = false;

        System.out.println("Links encontrados com a categoria '" + categoriaFiltro + "':");
        for (int i = 0; i < links.size(); i++) {
            if (links.get(i).getCategoria().equalsIgnoreCase(categoriaFiltro)) {
                System.out.println("[" + (i + 1) + "] " + links.get(i));
                System.out.println("--------------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum link encontrado para a categoria '" + categoriaFiltro + "'.\n");
        }
    }

    // Novo método para remover um link
    public void removerLink() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do link que deseja remover: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Para consumir a quebra de linha

        if (index > 0 && index <= links.size()) {
            links.remove(index - 1);
            System.out.println("Link removido com sucesso!\n");
        } else {
            System.out.println("Número inválido! Tente novamente.\n");
        }
    }

    // Exibe o menu para o usuário
    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("== Menu do Sistema de Links ==");
            System.out.println("1. Adicionar Link");
            System.out.println("2. Listar Links");
            System.out.println("3. Filtrar Links por Categoria");
            System.out.println("4. Remover Link");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Para consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarLink();
                    break;

                case 2:
                    listarLinks();
                    break;

                case 3:
                    filtrarLinksPorCategoria();
                    break;

                case 4:
                    removerLink();
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 5);
    }
}
