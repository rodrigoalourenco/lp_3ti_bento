/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lp.zoo;

/**
 *
 * @author Work
 */
public class TestaAnimal {

    
    public static void fazBarulhoSemPolimorfismo(String animal) {
        if(animal.equals("Cachorro")) {
            System.out.println("Au au");
        } else if(animal.equals("Ave")) {
            System.out.println("Co co ");
        } else if(animal.equals("Felino")) {
            System.out.println("Miau miau");
        } else {
            System.out.println("Barulho Generico");
        }
    }
    
    public static void fazBarulho(Animal animal) {
        animal.fazerBarulho();
    }
    
    public static void main(String[] args) {
        Animal anime = new Animal();
        //anime.fazerBarulho();
        Animal tipoCachorro = new Cachorro();
        //tipoCachorro.fazerBarulho();
        Animal tipoAve = new Ave();
        //tipoAve.fazerBarulho();
        //fazBarulho(new Felino());
        
        fazBarulhoSemPolimorfismo("Cachorro");
    }
    
}
