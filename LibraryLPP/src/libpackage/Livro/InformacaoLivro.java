package libpackage.Livro;

import java.util.Objects;

public class InformacaoLivro extends Livro {
    private int stock;

    // Construtor com parâmetros 
    public InformacaoLivro(String nomeCategoria, String descricao, String nome, String editor, int lancamento, String estado, int stock) {
        super(nomeCategoria, descricao, nome, editor, lancamento, estado); // Chama o construtor da classe base (Livro) 
        this.stock = stock;
    }
    
    // Construtor vazio 
    public InformacaoLivro() {
        super("", "", "", "", 0, ""); // Chama o construtor vazio da classe base (Livro) 
        this.stock = 0;
    }
    
    // Construtor de cópia 
    public InformacaoLivro(InformacaoLivro informacaoLivro) {
        super(informacaoLivro); // Chama o construtor de cópia da classe base (Livro) 
        this.stock = informacaoLivro.stock;
    }

    
    public int getStock() {
        return stock;
    }

    
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método para verificar se o livro está disponível com base no stock
    public String estaDisponivel() {
        if (stock >= 1) {
            return "Disponível";
        } else {
            return "Indisponível";
        }
    }

    // Sobrescrita do método print para imprimir as informações da informação do livro, incluindo as informações do livro e da categoria
    @Override
    public void print() {
        super.print(); // Chama o método print da classe base (Livro) para imprimir as informações do livro e da categoria
        System.out.println("Stock: " + stock);
    }

    // Override do método toString para retornar uma representação em string da informação do livro, incluindo as informações do livro e da categoria
    @Override
    public String toString() {
        return "InformacaoLivro{" +
                "nomeCategoria='" + getNomeCategoria() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", editor='" + getEditor() + '\'' +
                ", lancamento=" + getLancamento() +
                ", estado='" + getEstado() + '\'' +
                ", stock=" + stock +
                '}';
    }

    // Override do método equals para verificar se duas informações de livros são iguais com base nas informações do livro e no stock
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        InformacaoLivro livro = (InformacaoLivro) obj;
        return stock == livro.stock;
    }

    // Override do método hashCode para gerar um código hash com base nas informações do livro e no stock da informação do livro
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stock);
    }
}