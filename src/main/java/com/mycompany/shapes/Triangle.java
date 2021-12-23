/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import javax.swing.JOptionPane;

/**
 *
 * @author gemmy
 */
public class Triangle implements Shape {

    String[] lengths;
    double[] numericLengths;
    
    public Triangle(){
        lengths = new String[3];
        numericLengths = new double[3];
    }
    
    @Override
    public void inputRequired() {
        boolean again;
        do{
            again = false;
            
            for(int i = 0; i < 3; i++){
                lengths[i] = JOptionPane.showInputDialog("Enter the side number " + (i + 1) + "of your triangle:");
                numericLengths[i] = Double.parseDouble(lengths[i]);
            }
            Arrays.sort(numericLengths);
            if(numericLengths[0] + numericLengths[1] <= numericLengths[2]){
                JOptionPane.showMessageDialog(null, "This triangle is invalid, Try entering another one.");
                again = true;
            }
            
        }while(again);
    }

    @Override
    public double shapeArea() {
        double s = DoubleStream.of(numericLengths).sum() / 2d;
        double res = s;
        for(double i : numericLengths)
            res *= (s - i);
        return Math.sqrt(res);
    }

    @Override
    public double shapePerimeter() {
        return DoubleStream.of(numericLengths).sum();
    }
    
}
