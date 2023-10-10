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


public class ExB {
    
    public static void main(String[]  args)  {
    double altura, conta1, conta2;
    String sexo;
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:  "));
    sexo = JOptionPane.showInputDialog("Digite seu sexo:  ");
    conta1 = (72.7 * altura)-58;
    conta2 = (62.1 * altura)-44.7;
          
        
        if(sexo = masculino) {
            JOptionPane.showMessageDialog(null,"Peso ideal masculino:  " + conta1);
        
            
        }else{
            JOptionPane.showMessageDialog(null,"Peso ideal feminino:  " + conta2);
        }
    }
}
