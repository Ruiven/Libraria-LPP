/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libpackage.Livro;

import java.util.ArrayList;

/**
 *
 * @author Rui
 */
public class VerificaLivro {
    
    private ArrayList<Livro> livro = new ArrayList<>();
    
    //Verifica se o conteudo está em branco, se sim nao insere
    public boolean verificar (Livro l){
        if (l != null){
            livro.add(l);
            return true;
        }
        else{
            return false;
        }
    }
    
    //Criar um metodo para listar todos os livros previamente inseridos
    public ArrayList<Livro> returnLivros(){
        return livro;
    }
}
