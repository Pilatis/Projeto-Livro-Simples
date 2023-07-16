/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetolivro;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ProjetoLivro {

    public static void main(String[] args) {
        
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];
        
        
        
        p[0] = new Pessoa("pedro", 22, "M"); 
        p[1] = new Pessoa("Maria", 25, "F");
     
        l[0] = new Livro("Dom quixote", "Fabio", 300, p[0] );    
        l[1] = new Livro("Dom quixote2", "Lucas", 250, p[1]);
        l[2] = new Livro("Dom quixote3", "Carlos", 250, p[0]);
        
        l[0].abrir();
        l[0].folhear(240);
        JOptionPane.showMessageDialog(null, l[0].detalhes()); 
       
    }
}
