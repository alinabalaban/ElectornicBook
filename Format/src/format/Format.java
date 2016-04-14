/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package format;

/**
 *
 * @author Alina
 */
public class Format {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder ("Able was i ere I saw Elba");
         System.out.println(sb.length()); 
         StringBuilder H=new StringBuilder ("Did Hannah see bees? Hannah did.");
         System.out.println(H.length()); 
         System.out.println("Was it a Car or a cat I saw?".substring(9,12));
        
    }
    
}
