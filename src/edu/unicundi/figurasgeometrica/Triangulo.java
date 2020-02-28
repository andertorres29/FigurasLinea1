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
public class Triangulo extends Figuras{
    private int lado3;
    private String tipo;
    
    public Triangulo (String t, int l1, int l2, int l3){
        setLado1(l1);
        setLado2(l2);
        this.lado3 = l3;
        this.tipo = t;
    }
    
    public int hallarPerimetro(){
        int per = getLado1() + getLado2() + lado3;
        System.out.println("El perimetro es: "+per);
        return per;
    }
    
    public int hallarArea(){
        int are = (getLado1() * getLado2())/2;
        System.out.println("El area es: "+are);
        return are;
    }
    
    public void mostraTipo(){
        System.out.println("EL tipo de figura es: "+tipo);
        
    }
}
