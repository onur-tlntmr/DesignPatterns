/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class AudiFabrika extends Fabrika {

    private final Audi audi = new Audi();
    
    @Override
    public Araba ArabaUret(String model) {
        audi.setModel(model);
        return audi;
    }

    @Override
    public void ParcaEkle(String parca) {
        audi.getOpsiyonel_parcalar().add(parca);
    }
    
}
