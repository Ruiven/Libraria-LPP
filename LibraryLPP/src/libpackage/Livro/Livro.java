package libpackage.Livro;

import java.util.Objects;

public class Livro extends Categoria {
    private String nome;
    private String editor;
    private int lancamento;
    private String estado;

    // Construtor com parâmetros 
    public Livro(String nomeCategoria, String descricao, String nome, String editor, int lancamento, String estado) {
        super(nomeCategoria, descricao); // Chama o construtor da classe base (Categoria) 
        this.nome = nome;
        this.editor = editor;
        this.lancamento = lancamento;
        this.estado = estado;
    }
    
    
    public static String piadaStr = "Por que o livro de geografia está sempre cansado?\n Porque ele está cheio de 'capítulos' longos!";
    
    //Este método quando chamado executa primeiro o metodo piada da classe Categoria pois tem o prefixo super.
    public void piada(){
            super.piada();
            System.out.println("\n\n");
            System.out.println(piadaStr);
    }
    
    // Construtor vazio 
    public Livro() {
        super("", ""); // Chama o construtor vazio da classe base (Categoria) 
        this.nome = "";
        this.editor = "";
        this.lancamento = 0;
        this.estado = "";
    }
    
    //Possivel adicionar atravez de construtor sem parametros também
    /*  public Livro() {
    this("Drama","Livro dramático","O vento","Maria Aguiar",1999,"Velho");
    }  */
    
    
    // Construtor de cópia 
    public Livro(Livro livro) {
        super(livro); // Chama o construtor de cópia da classe base (Categoria) 
        this.nome = livro.nome;
        this.editor = livro.editor;
        this.lancamento = livro.lancamento;
        this.estado = livro.estado;
    }
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEditor() {
        return editor;
    }

    
    public void setEditor(String editor) {
        this.editor = editor;
    }

    
    public int getLancamento() {
        return lancamento;
    }

    
    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    
    public String getEstado() {
        return estado;
    }

    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Override do método print para imprimir as informações do livro, incluindo as informações da categoria
    @Override
    public void print() {
        super.print(); // Chama o método print da classe base (Categoria) para imprimir as informações da categoria
        System.out.println("Nome: " + nome);
        System.out.println("Editor: " + editor);
        System.out.println("Lançamento: " + lancamento);
        System.out.println("Estado: " + estado);
    }

    // Override do método toString para retornar uma representação em string do livro, incluindo as informações da categoria
    @Override
    public String toString() {
        return "Livro{" +
                "nomeCategoria='" + getNomeCategoria() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", nome='" + nome + '\'' +
                ", editor='" + editor + '\'' +
                ", lancamento=" + lancamento +
                ", estado='" + estado + '\'' +
                '}';
    }

    // Override do método equals para verificar se dois livros são iguais com base nas informações da categoria, nome, editor, ano de lançamento e estado
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
        Livro livro = (Livro) obj;
        return nome.equals(livro.nome) && editor.equals(livro.editor) && lancamento == livro.lancamento
                && estado.equals(livro.estado);
    }

    // Override do método hashCode para gerar um código hash com base nas informações da categoria, nome, editor, ano de lançamento e estado do livro
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, editor, lancamento, estado);
    }
}


