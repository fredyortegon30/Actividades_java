/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner; //importar class de Scanner
import javax.swing.JOptionPane;

/**
 *
 * @author fredyortegon
 */

public class prueba6 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
      int largo = 0;
        int altura = 0;
        String largo1 = "";
        String altura1 = "";
        String result = "";
        
        largo = Integer.parseInt(JOptionPane.showInputDialog("Inserte largo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura. "));
        
        for(int i=0; i<largo; i++){
            largo1 = largo1 + "*"; 
            
        }
        
        System.out.println(largo1);
        
        for(int t=0; t<largo-2; t++){
             result = result + " "; 
        }
        
        for(int j=0; j<altura-2; j++){
            
            String result1 = largo1.substring(1, 2);
            
            
                System.out.println(result1 + result + result1);
        }
        System.out.println(largo1);  
    }
    
}
