/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

import javax.swing.JOptionPane;

/**
 *
 * @author gemmy
 */
public class Circle implements Shape {

    String radius;
    public double numericRadius;
    
    public Circle(){
        radius = "";
        numericRadius = 0.0d;
    }
    
    @Override
    public void inputRequired() {
        radius = JOptionPane.showInputDialog("Enter the radius of your circle");
        numericRadius = Double.parseDouble(radius);
    }

    @Override
    public double shapeArea() {
        return PI * (Math.pow(numericRadius, 2));
    }

    @Override
    public double shapePerimeter() {
        return 2d * PI * numericRadius;
    }
    
}
