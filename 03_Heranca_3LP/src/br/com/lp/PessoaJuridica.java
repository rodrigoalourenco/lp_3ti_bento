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
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void mostraClasse() {
        System.out.println("classe Pessao Juridica");
    }
    
    
}
