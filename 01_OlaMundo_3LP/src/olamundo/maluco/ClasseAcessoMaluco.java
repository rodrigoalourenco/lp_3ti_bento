/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundo.maluco;

import olamundo.Pessoa;

/**
 *
 * @author Work
 */
public class ClasseAcessoMaluco extends Pessoa{
    
    public static void main(String[] args) {
        ClasseAcessoMaluco p = new ClasseAcessoMaluco("Eliana", 47);
        p.sobreNome();
    }

    public ClasseAcessoMaluco(String nome, int idade) {
        super(nome, idade);
    }
    
    
}
