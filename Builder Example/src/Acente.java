/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Acente {

    public Bmw BmwTalebi(String model,String[] parcalar){
        BmwFabrika bf = new BmwFabrika();
        for(String parca : parcalar){
            bf.ParcaEkle(parca);
        }
        return (Bmw) bf.ArabaUret(model);
        
    }
    
    
    public Audi AudiTalebi(String model,String[] parcalar){
        AudiFabrika af = new AudiFabrika();
        for(String parca : parcalar){
            af.ParcaEkle(parca);
        }
        return (Audi) af.ArabaUret(model);
    }

}
