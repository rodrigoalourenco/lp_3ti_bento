/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lp.zooInterface;

/**
 *
 * @author Work
 */
public class Cachorro extends Especie implements Animal, SerVivo{

    @Override
    public void fazerBarulho() {
        System.out.println("Au au");
    }

    @Override
    public void respirar() {
        System.out.println("Animal Respirando");
    }

    @Override
    public void tipoEspecie() {
        System.out.println("Especie Cachorro");
    }
    
    
    
}
