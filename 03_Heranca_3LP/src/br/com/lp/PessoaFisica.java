/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lp;

/**
 *
 * @author Work
 */
public class PessoaFisica extends Pessoa {
    
    private String rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void mostraClasse() {
        System.out.println("classe Pessoa Fisica");
    }
            
    
}
