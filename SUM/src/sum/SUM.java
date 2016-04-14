/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;
import java.util.Properties;
import java.util.Scanner;
/**
 *
 * @author Alina
 */
public class SUM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Scanner keyboard = new Scanner(System.in);
      System.out.println("enter A");
      int A = keyboard.nextInt();
      System.out.println("enter B");
      int B = keyboard.nextInt();
      System.out.println(A+B);
      Properties properties=System.getProperties();
     System.out.println("Java Version "+ properties.getProperty("java.version"));
     System.out.println("Java Home "+ properties.getProperty("java.home"));
       System.out.println("Java VM vendor "+ properties.getProperty("java.vm.vendor"));
     System.out.println("Java user "+ properties.getProperty("user.name"));
     System.out.println("Java OS "+ properties.getProperty("os.name"));
    }
    
}
