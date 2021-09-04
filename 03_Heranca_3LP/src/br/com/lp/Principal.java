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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Rodrigo");
        pf.setRg("123456789");
        
        
        PessaoFisicaCPF pf2 = new PessaoFisicaCPF();
        pf2.setNome("Pessao");
        pf2.setRg("PessoaFisica");
        pf2.setCpf("PessoaFisicaCPF");
    }
    
}
