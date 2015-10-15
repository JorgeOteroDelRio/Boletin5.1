/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

/**
 *
 * @author joterodelrio
 */
public class Coche {
    private int velocidade;
    
    public int getVelocidade(){
        return velocidade;
    }
    public void acelerar(int valor){
        velocidade += valor;
    }
    public void frenar(int menos){
        velocidade -= menos;
    }
    
}
