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
public class ClassePrincipal {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        p.setNome("Rodrigo");
        p.setIdade(38);
        System.out.println(p.toString());
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Xuxa");
        p1.setIdade(58);
        System.out.println(p1.toString());
        
        Pessoa p2;
        p2 = new Pessoa();
        
               
    }

}
