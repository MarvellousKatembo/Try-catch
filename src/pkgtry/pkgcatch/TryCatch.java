/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgtry.pkgcatch;

/**
 *
 * @author Merva_E
 */
public class TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int d, a; 
try { // monitor a block of code. 
d = 0; 
a = 42 / d; 
System.out.println("This will not be printed."); 
} catch (ArithmeticException e) { // catch divide-by-zero error 
System.out.println("Division by zero."); 
} 

} 
}


