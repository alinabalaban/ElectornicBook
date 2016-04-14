/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author Alina
 * @param <T>
 */
public class Box <T>{
    private T t;
    
    public void set (T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    public <U extends Number> void inspect (U u){
        System.out.println("T : "+ t.getClass().getName());
        System.out.println("U : "+ u.getClass().getName());
    }
    public static void main (String [] args){
        Box<Integer> integerBox= new Box<>();
       integerBox.set(new Integer(10));
       ///integerBox.inspect("some text");//ERR
       Integer intObject;
       intObject=20;
       integerBox.inspect(intObject);
       Double doubleObject;
       doubleObject=30.30;
       integerBox.inspect(doubleObject);
       
       
       Box<Double> doubleBox=new Box<>();
       doubleBox.set(new Double(3));
       Double adouble;
       adouble=40.40;
       doubleBox.inspect(adouble);
       
       
        
    }
    
    
}
