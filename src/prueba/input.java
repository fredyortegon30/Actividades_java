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

public class input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        String userName;
           // escriba username y presione enter
        System.out.println("Ingrese un nombre");
        userName = myObj.nextLine();
        
        System.out.println("El usuario es: "+ userName);
        
    }
    
}
