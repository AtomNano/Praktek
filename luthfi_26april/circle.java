/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luthfi_26april;

/**
 *
 * @author luthf
 */
public class circle extends Shape{
    private int jari;
    
    public circle(){
}
    public int getjari(){
        return jari;
    }
    
    public void setJari(int jari){
        this.jari=jari;
    }
    
    @Override
    public String getName(){
        return "circle";
    }
    
    @Override
    public double getArea(){
        return 3.14 * jari * jari;
    }
}
