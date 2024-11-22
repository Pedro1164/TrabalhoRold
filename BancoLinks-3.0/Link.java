public class Link {
    private String url;
    private String descricao;
    private String categoria;

    public Link(String url, String descricao, String categoria) {
        if (url == null || url.isEmpty() || descricao == null || descricao.isEmpty() || categoria == null || categoria.isEmpty()) {
            throw new IllegalArgumentException("Todos os campos (URL, Descrição e Categoria) devem ser preenchidos!");
        }
        this.url = url;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getUrl() {
        return url;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Categoria: " + categoria + "\nDescrição: " + descricao + "\nURL: " + url;
    }
}
