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

public class prueba4 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner largo = new Scanner(System.in);
        Scanner ancho = new Scanner(System.in);
        
        int largo1;
        int ancho1;
        String maxa = "********************";
        String maxe = "                  *";
        String mina = "*";
        String salida = "";
        String espacios = "";
        
        largo1 = largo.nextInt();  
        ancho1 = ancho.nextInt();
        
        String a = "";
        
        salida = maxa.substring(1,largo1+1);
        System.out.println(salida);
        
        for (int i=0; i<=ancho1; i++)
        {
            if (i<=ancho1-1 && i>1 )
            {
                espacios = maxe.substring(largo1,19);
                System.out.println("*"+espacios);
            }
            
        }
         System.out.println(salida);
        
    }
    
}
