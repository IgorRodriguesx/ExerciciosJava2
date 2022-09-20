/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2;

/**
 *
 * @author igoro
 */
import javax.swing.JOptionPane;
public class ExG {
    public static void main(String[] args){
        double adição, subtração, multiplicação, divisão, n1, n2;
        String operação;
      
        operação = JOptionPane.showInputDialog("Qual seria a operação?  ");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro número da " + operação));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo número da " + operação));
         
        adição = n1 + n2;
        subtração = n1 - n2;
        multiplicação = n1 * n2;
        divisão = n1 / n2;       
           if(operação = adição) {
               JOptionPane.showMessageDialog(null,"O resultado da"+operação+"é:" + adição);
               
                //Segunda vez que esse erro ocorreu e eu não sei como resolver
                
                
                
                
            }
        
        
        
    }
    
}
