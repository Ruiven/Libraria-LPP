
package libpackage.Livro;


public class Main {
    //public static String piadaStr = "Por que o livro de geografia está sempre cansado?\n Porque ele está cheio de 'capítulos' longos!";
    
    public static void main(String[] args) {
        
        VerificaLivro vf = new VerificaLivro();
        
        Livro livro = new Livro("Ficção Científica", "Descrição do Livro", "Livro 1", "Editora A", 2023, "Novo");
        System.out.println(livro);

        System.out.println();

       
        InformacaoLivro infoLivro = new InformacaoLivro("Romance", "Descrição do Livro", "Livro 2", "Editora B", 2021, "Usado", 0);
        infoLivro.setStock(5);
        System.out.println(infoLivro);
        System.out.println("Está disponível? " + infoLivro.estaDisponivel());

        System.out.println();

        
        Categoria categoria = new Categoria("Terror", "Descrição da Categoria");
        System.out.println(categoria);
        
        livro.piada();
        
            
        JFrame_Index jfindex = new JFrame_Index(); 
        jfindex.setVisible(true);
    }
}