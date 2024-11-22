import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemadeLinks {
    private ArrayList<Link> links;
    private static final String FILE_PATH = "links.txt";

    public SistemadeLinks() {
        links = new ArrayList<>();
        carregarLinks();
    }

    // Método para adicionar um link
    public void adicionarLink() {
        try (Scanner scanner = new Scanner(System.in)) {
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
            salvarLinks();

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
        try (Scanner scanner = new Scanner(System.in)) {
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
    }

    // Novo método para remover um link
    public void removerLink() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número do link que deseja remover: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Para consumir a quebra de linha

            if (index > 0 && index <= links.size()) {
                links.remove(index - 1);
                System.out.println("Link removido com sucesso!\n");
                salvarLinks();
            } else {
                System.out.println("Número inválido! Tente novamente.\n");
            }
        }
    }

    // Novo método para editar um link
    public void editarLink() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número do link que deseja editar: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Para consumir a quebra de linha

            if (index > 0 && index <= links.size()) {
                Link link = links.get(index - 1);
                System.out.println("Editando link: " + link);

                System.out.print("Digite a nova URL (deixe em branco para não alterar): ");
                String url = scanner.nextLine();
                if (!url.isEmpty()) {
                    link.setUrl(url);
                }

                System.out.print("Digite a nova descrição (deixe em branco para não alterar): ");
                String descricao = scanner.nextLine();
                if (!descricao.isEmpty()) {
                    link.setDescricao(descricao);
                }

                System.out.print("Digite a nova categoria (deixe em branco para não alterar): ");
                String categoria = scanner.nextLine();
                if (!categoria.isEmpty()) {
                    link.setCategoria(categoria);
                }

                System.out.println("Link editado com sucesso!\n");
                salvarLinks();
            } else {
                System.out.println("Número inválido! Tente novamente.\n");
            }
        }
    }

    // Método para salvar links em um arquivo
    private void salvarLinks() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Link link : links) {
                writer.println(link.getUrl() + ";" + link.getDescricao() + ";" + link.getCategoria());
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os links: " + e.getMessage());
        }
    }

    // Método para carregar links de um arquivo
    private void carregarLinks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    links.add(new Link(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Nenhum arquivo de links encontrado, iniciando com lista vazia.");
        }
    }

    // Método para classificar os links
    public void classificarLinks() {
        links.sort((link1, link2) -> link1.getCategoria().compareToIgnoreCase(link2.getCategoria()));
        System.out.println("Links classificados por categoria:\n");
        listarLinks();
    }

    // Exibe o menu para o usuário
    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println();
            System.out.println("==Menu do Sistema de Links==");
            System.out.println("1. Adicionar Link");
            System.out.println("2. Listar Links");
            System.out.println("3. Filtrar Links por Categoria");
            System.out.println("4. Remover Link");
            System.out.println("5. Editar Link");
            System.out.println("6. Classificar Links");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Para consumir a quebra de linha
            System.out.println();

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
                    editarLink();
                    break;

                case 6:
                    classificarLinks();
                    break;

                case 7:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 7);

        scanner.close();
    }
}
