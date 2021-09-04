/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

/**
 *
 * @author Work
 */
public class Principal {
    
    public static void main(String[] args) {
        OutraClassePessoa obj = new OutraClassePessoa();
        obj.setNum(10);
        obj.setNum2(40);
        obj.setSoma(obj.getNum() + obj.getNum2());
        
        System.out.println(obj.getSoma());
    }
    
}
