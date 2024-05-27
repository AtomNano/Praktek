/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luthfi_26april;

/**
 *
 * @author luthf
 */
public class Square extends Shape {
    private int sisi;
    
    public Square(){
    }
    public int getSisi(){
    return sisi;
    
}

public void setSisi(int sisi){
    this.sisi=sisi;
}

    @Override
    public String getName(){
    return "Square";
}

    @Override
    public double getArea(){
    return sisi * sisi;
}
    
}

    


