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
public class ClasseTeste {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("xuxa", 58);
        String nome = p.nome();
        System.out.println(nome);
        
        String sobreNome = p.sobreNome();
//        String nomeCompleto = p.
        
//        ClasseTeste obj = new ClasseTeste();
//        obj.imprimir();
//        
//        int num = obj.soma();
//        System.out.println(num);
//        
//        obj.imprimir("Rodrigo");
//        obj.imprimir("Flavia", 25);
//        
//        System.out.println(obj.soma(123, 456));

    }
    
    public void imprimir() {
        int num = 5;
        int num2 = 5;
        int soma =  num + num2;
        System.out.println("IMPRIMINDO " + soma);
    } 
    
    public int soma() {
        int num = 5;
        int num2 = 5;
        int soma =  num + num2;
        return soma;
    }
    
    public void imprimir(String nome) {
        System.out.println("Ola " + nome);
    }
    
    public void imprimir(String nome, int idade) {
        System.out.println(nome + " sua idade é " + idade);
    }
    
    public int soma(int valor1, int valor2) {
        return valor1 + valor2;
    }
    
    
    
}
