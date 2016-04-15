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
public class Phone extends Lucrusoare {
    public static String Status = "OFF";
    public String  Brand ;
    public String  Type;
    
public void setBrand( String newBrand ){
 Brand = newBrand;
  System.out.println("This Phone is  "+Brand );
 }
public void setType( String newType ){
 Type = newType;
  System.out.println("This Phone is  "+Type +" Phone");
 }


public void STOP (){
        
if (Status=="OFF") {
    System.out.println("This Phone is already "+Status );
        } else {
    Status="OFF";
    System.out.println("This Phone is  "+Status );
        }
        }


public void Start( ){
if (Status=="ON") {
    System.out.println("This Phone is already "+Status );
        } else {
      Status="ON";
    System.out.println("This Phone is  "+Status );
        }
        }





       
       
   }
    

