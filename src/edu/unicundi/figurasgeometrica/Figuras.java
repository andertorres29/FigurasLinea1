/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometrica;

/**
 *
 * @author Ander
 */
public class Figuras {
    private int lado1;
    private int lado2;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int l1) {
        this.lado1 = l1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int l2) {
        this.lado2 = l2;
    }
    
    public void mostrarDatos(){
        System.out.println("La base es: "+lado1);
        System.out.println("El altura es: "+lado2);
    }   
}

