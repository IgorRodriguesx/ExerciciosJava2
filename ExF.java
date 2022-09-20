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
public class ExF {
    public static void main(String[] args){
        double n1, n2, n3, resultado, conta;
      
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:  "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:  "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:  "));
        conta = n1 < n2 < n3;
        resultado = Double.parseDouble(JOptionPane.showMessageDialog(null,"resultado em ordem crescente:  " + conta));
        
                
                
                
            }
       
        
        
        
        
}

