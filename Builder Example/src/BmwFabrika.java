/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class BmwFabrika extends Fabrika{

    private final Bmw bmw = new Bmw();
    @Override
    public Araba ArabaUret(String model) {
        bmw.setModel(model);
        return bmw;
    }

    @Override
    public void ParcaEkle(String parca) {
        bmw.getOpsiyonel_parcalar().add(parca);
    }
    
}
