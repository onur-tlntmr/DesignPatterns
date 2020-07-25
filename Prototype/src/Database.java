
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Database implements Cloneable{

    
    private String isim;
    private ArrayList<String> tablo_listesi;
    
    public Database(){
        isim = "Model";
        tablo_listesi = new ArrayList<>();
        tablo_listesi.add("sysusers");
        tablo_listesi.add("sysindexs");
        tablo_listesi.add("sysfiles");
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void TabloEkle(String tablo){
        tablo_listesi.add(tablo);
    }
    
    public void TabloListele(){
        for(String tablo : tablo_listesi){
            System.out.println(tablo);
        }
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Database();
    }
    
}
