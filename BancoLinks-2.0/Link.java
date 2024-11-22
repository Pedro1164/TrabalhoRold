
public class Link {
    private String url;
    private String descricao;
    private String assunto;

    public Link(String url, String descricao, String assunto) {
        if (url == null || url.isEmpty() || descricao == null || descricao.isEmpty() || assunto == null || assunto.isEmpty()) {
            throw new IllegalArgumentException("Todos os campos (URL, Descrição e Assunto) devem ser preenchidos!");
        }
        this.url = url;
        this.descricao = descricao;
        this.assunto = assunto;
    }

    public String getUrl() {
        return url;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAssunto() {
        return assunto;
    }

    @Override
    public String toString() {
        return "Assunto: " + assunto + "\nDescrição: " + descricao + "\nURL: " + url;
    }
}
