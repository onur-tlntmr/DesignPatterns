/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Sample {
    
    private static Sample s;
    public static Object lock_object = new Object();
    
    private Sample(){
        
    }
    
    public static Sample getInstance(){
        synchronized(lock_object){
            if(s == null){
                s = new Sample();
            }
            return s;
        }
    }
    
    
    
}
