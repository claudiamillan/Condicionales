/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author lab12
 */
public class Calificacion 
{
  public static void main(String[] args)
      
  {
    float nota1, nota2, nota3, promedio;
        
nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa una nota"));
nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa otra nota"));
nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa otra nota"));
promedio = (nota1+nota2+nota3)/3;

if (promedio >= 4)//Aqui va una condicion
{
    //Si no se cumple la condicion se ejecuta esto
    JOptionPane.showMessageDialog(null, "Aprobado");  
}
  else
{
     //Si no se cumple la condicion se ejecuta esto
     JOptionPane.showMessageDialog(null, "Reprobado");
   
  }  
  
}
}

        
