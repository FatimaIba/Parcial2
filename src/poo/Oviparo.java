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
public abstract class Oviparo extends Animal {
   public Oviparo(){ 
   }
   @Override
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
