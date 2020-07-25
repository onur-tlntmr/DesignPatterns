/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Main {
    public static void main(String[] args) {
        TCDarphane darphane = new TCDarphane();
        IMF imf = new IMF();
        
        Lira tl = (Lira)darphane.ParaBas(200);
        
        Dolar d = (Dolar) imf.ParaBas(100);
        
        
        System.out.println("Basılan Para: "+tl.getNominalDeger());
        System.out.println("Basılan dolar: "+d.getNominalDeger());
        
        
        
    }
}
