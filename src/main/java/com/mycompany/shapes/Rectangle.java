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
public class Rectangle implements Shape {

    public String width, height, name = "Rectangle";
    public double numericWidth, numericHeight;
    
    public Rectangle(){
        width = height = "";
        numericWidth = numericHeight = 0.0d;
    }
    
    @Override
    public void inputRequired() {
        
        width = JOptionPane.showInputDialog("Enter the width of your rectangle:");
        height = JOptionPane.showInputDialog("Enter the length of your rectangle:");
        
        numericWidth = Double.parseDouble(width);           
        numericHeight = Double.parseDouble(height);
    }

    @Override
    public double shapeArea() {
        return numericHeight * numericWidth;
    }

    @Override
    public double shapePerimeter() {
        return 2d * (numericHeight + numericWidth);
    }
    
}
