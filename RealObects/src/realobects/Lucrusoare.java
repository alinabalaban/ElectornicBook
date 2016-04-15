/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realobects;

/**
 *
 * @author Alina
 */
public class Lucrusoare {
    public String Position;
    public String Useful;
    public static String Status = "ON";
    public void use ( String newUseful, String newPosition ){
Position=newPosition;
Useful=newUseful;
  System.out.println("This Lucrusor  is  "+Useful +" From position " + Position);
 }
    
}
