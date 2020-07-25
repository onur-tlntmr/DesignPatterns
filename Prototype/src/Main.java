
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Database mdl = new Database();
        
        
        try {
            Database db1  = (Database)mdl.clone();
            db1.setIsim("Personel");
            db1.TabloEkle("PersonelListesi");
            db1.TabloEkle("PersonelProjeTablosu");
            db1.TabloListele();
            
            Database db2 = (Database)mdl.clone();
            
            db2.setIsim("Maliye");
            db2.TabloEkle("SatisTablosu");
            db2.TabloEkle("İadeTablosu");
            db2.TabloEkle("SatisIptalTablosu");
            db2.TabloListele();
            
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
