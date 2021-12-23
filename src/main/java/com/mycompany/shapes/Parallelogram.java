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
public class Parallelogram implements Shape {

    String side, base, height;
    public double numericSide, numericBase, numericHeight;
    
    public Parallelogram(){
        side = base = height = "";
        numericSide = numericBase = numericHeight = 0.0d;
    }
    
    @Override
    public void inputRequired() {
        base = JOptionPane.showInputDialog("Enter the base length of your parallelogram: ");
        side = JOptionPane.showInputDialog("Enter the side length of your parallelogram:");
        height = JOptionPane.showInputDialog("Enter the height of your parallelogram:");
        
        numericSide = Double.parseDouble(side);
        numericBase = Double.parseDouble(base);
        numericHeight = Double.parseDouble(height);
    }

    @Override
    public double shapeArea() {
        return numericBase * numericHeight;
    }

    @Override
    public double shapePerimeter() {
        return 2d * (numericSide * numericBase);
    }
    
}
