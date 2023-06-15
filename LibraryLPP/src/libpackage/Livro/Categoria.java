package libpackage.Livro;

import java.util.Objects;

public class Categoria {
    private String nomeCategoria;
    private String descricao;

    //Metodo para mostrar o super como um metodo usado no livro
    public void piada(){
        System.out.println("\nPor que o livro de fantasia ganha sempre todos os prêmios?\n Porque ele esta numa 'categoria' de outro mundo!!");
    }
    
    // Construtor com parâmetros 
    public Categoria(String nomeCategoria, String descricao) {
        this.nomeCategoria = nomeCategoria;
        this.descricao = descricao;
    }
    
    // Construtor vazio 
    public Categoria() {
        this.nomeCategoria = "";
        this.descricao = "";
    }
    
    // Construtor de cópia 
    public Categoria(Categoria categoria) {
        this.nomeCategoria = categoria.nomeCategoria;
        this.descricao = categoria.descricao;
    }

    
    public String getNomeCategoria() {
        return nomeCategoria;
    }

    
    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para imprimir as informações da categoria
    public void print() {
        System.out.println("Nome da Categoria: " + nomeCategoria);
        System.out.println("Descrição: " + descricao);
    }

    // Override do método toString para retornar uma representação em string da categoria
    @Override
    public String toString() {
        return "Categoria{" +
                "nomeCategoria='" + nomeCategoria + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    // Override do método equals para verificar se duas categorias são iguais com base em nome e descrição
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Categoria categoria = (Categoria) obj;
        return nomeCategoria.equals(categoria.nomeCategoria) && descricao.equals(categoria.descricao);
    }

    // Override do método hashCode para gerar um código hash com base no nome e descrição da categoria
    @Override
    public int hashCode() {
        return Objects.hash(nomeCategoria, descricao);
    }
}