/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner; //importar class de Scanner

/**
 *
 * @author fredyortegon
 */

public class prueba5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero = new Scanner(System.in);
        String numero1 = numero.nextLine();  
       
        
        String a = numero1.substring(1, 2) + numero1.substring(0, 1);
        String b = numero1.substring(3,5);
        
        //System.out.println(a);
        //System.out.println(b);
        if (a.equals(b))
        {
            System.out.println("Numero palíndromo");
        }
        
    }
    
}
