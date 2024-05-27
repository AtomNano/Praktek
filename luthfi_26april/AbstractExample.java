/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luthfi_26april;

/**
 *
 * @author luthf
 */
public class AbstractExample {
    public static void main(String[] args){
       Square square = new Square();
       square.setSisi(20);
       System.out.println("Name  :"+square.getName());
       System.out.println("Area  :"+square.getArea());
       
       circle circle = new circle();
       circle.setJari(14);
       System.out.println("Name  :"+circle.getName());
       System.out.println("Area  :"+circle.getArea());
    }
}
