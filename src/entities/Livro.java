package entities;

import OrganizationEnumAndOther.MajorityAge;

public class Livro {
    private String titulo;
    private String descricao;
    private String autor;
    private String categoria;
    private boolean status;
    private MajorityAge majorityAge;


    public Livro(String titulo, String descricao, String autor, String categoria, MajorityAge majorityAge,boolean status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.categoria = categoria;
        this.majorityAge = majorityAge;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public MajorityAge getMajorityAge() {
        return majorityAge;
    }

    public boolean getDisponivel() {
        return status;
    }

    public void setDisponivel(boolean disponivel) {
        this.status = disponivel;
    }

    @Override
    public String toString() {
        String statusLivro = getDisponivel() == true ? "Disponível" : "Indisponível";
        return String.format("Titulo do Livro : %s " + "%n"
        + "Descricao do Livro : %s " + "%n"
        + "Autor do Livro : %s " + "%n"
        + "Categoria do Livro : %s " + "%n"
        + "Status do Livro : %s " + "%n"
        ,titulo, descricao, autor, categoria, statusLivro);

    }
}
