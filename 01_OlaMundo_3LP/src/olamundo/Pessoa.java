/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundo;

/**
 *
 * @author Work
 */
public class Pessoa {
    
    String nome;
    int idade;
    
    
        
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String nome() {
        //Logic your program
        return "Rodrigo";
    }
    
    protected String sobreNome() {
        return "Lourenço";
    }
    
    private String nomeCompleto() {
        return this.nome() + " " + this.sobreNome(); 
//        return "Rodrigo Lourenço";
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
    }
    
    
    
}
