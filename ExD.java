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
public class ExD {
    public static void main(String[] args) {
        double n1, n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:  "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:  "));
            if(n1 < n2) {
                JOptionPane.showMessageDialog(null,"O menor número é o:  " + (.2f + n1));
                
            }else{
                JOptionPane.showMessageDialog(null,"O menor número é o:  " + (.2f + n2));
                
            }
        
        
        
    }
    
    
}
