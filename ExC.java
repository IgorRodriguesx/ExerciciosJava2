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

public class ExC {
    public static void main(String[] args)  {
    int n1, n2;
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:  "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:  "));
        if(n1 > n2) {
            JOptionPane.showMessageDialog(null,"O maior número é o:  " + n1);
            
        }else{
            JOptionPane.showMessageDialog(null,"O número maior é o:  " + n2);
            
        }    
            
            
            
        }
    
    
    
}
