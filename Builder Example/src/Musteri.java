/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Musteri {
    public static void ArabaIstegi(Markalar marka,String model,String[] parcalar){
        Acente acente = new Acente();
        
        if(Markalar.AUDI == marka){
            Audi a = acente.AudiTalebi(model, parcalar);
            System.out.println(a);
        }
        
        else{
            Bmw b = acente.BmwTalebi(model, parcalar);
            System.out.println(b);
        }
    }
}
