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

    public static void main(String[] args) {
        Gerente g = new Gerente();
        
        g.setCodigo(15);
        g.setSenha("1234");
        g.setUsuario("brasil");
        
        Funcionario f = g;
        
        System.out.println("Codigo Gerente: " + g.getCodigo());
        System.out.println("Codigo Funcionario: " + f.getCodigo());
        
    }
    
}
