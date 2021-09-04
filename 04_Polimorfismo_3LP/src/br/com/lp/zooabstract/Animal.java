/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lp.zooabstract;


/**
 *
 * @author Work
 */
public abstract class Animal {
    private double peso;
    private String comida;

    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
    
    public void comer() {
        
    }
    
    public void dormir(){
        
    }
    
    public void movimentar() {
        
    }
    
    public abstract void fazerBarulho();
    
    
    
    
    
    
    
    
    
    
}
