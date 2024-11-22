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

            System.out.print("Digite o assunto: ");
            String assunto = scanner.nextLine();

            Link link = new Link(url, descricao, assunto);
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

    // Novo método para filtrar links por assunto
    public void filtrarLinksPorAssunto() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o assunto para filtrar os links: ");
        String assuntoFiltro = scanner.nextLine();

        boolean encontrado = false;
        
        System.out.println("Links encontrados com o assunto '" + assuntoFiltro + "':");
        for (int i = 0; i < links.size(); i++) {
            if (links.get(i).getAssunto().equalsIgnoreCase(assuntoFiltro)) {
                System.out.println("[" + (i + 1) + "] " + links.get(i));
                System.out.println("--------------------------");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("Nenhum link encontrado para o assunto '" + assuntoFiltro + "'.\n");
        }
    }

    // Exibe o menu para o usuário
    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==Menu do Sistema de Links==");
            System.out.println("1. Adicionar Link");
            System.out.println("2. Listar Links");
            System.out.println("3. Filtrar Links por Assunto");
            System.out.println("4. Sair");
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
                    filtrarLinksPorAssunto();
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 4);
    }
}
