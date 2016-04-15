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
public class Cup extends Lucrusoare implements KeepsWater  {
    public String  integrity;
   public String  colour;
   public String state;
    public String content;
    public int Quantity=10;
    
   public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int holdsQuantity() {
         System.out.println("This cup is  holding "+Quantity);
        return 0;
    }
    
    public void DeterminateIntegrity(String newIntegrity){
       integrity=newIntegrity;
       
       System.out.println("This cup is  "+newIntegrity);
   }
   public void FillUp(String newContent,String newState ){
       content=newContent;
       state=newState;
       
       System.out.println("This cup contains  "+content+" and it is "+state+ " and it is "+ integrity );
   }
   ;
      public void DetermineColor(String newColour){
       colour=newColour;
       
       System.out.println("This cup is:  "+newColour);
   } 
    
}
