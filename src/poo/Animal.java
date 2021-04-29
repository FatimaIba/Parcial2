/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author fatii
 */
public abstract class Animal implements CompA {
    protected String color;
    protected String tamano;
    
    public Animal(String color, String tamano){
    this.color = color;
    this.tamano = tamano;
    }
    public String getcolor(String color) {
        return color;
    }
    @Override
    public void setcolor(String color) {
        this.color = color;
    }
    @Override
    public String gettamano() {
        return tamano;
    }
    @Override
    public void settamano(String tamano) {
        this.tamano = tamano;
    }
}
