

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Connection {
    
    private boolean valid;
    private long time;
    private String name;
    ConnectionPool cp;
    public Connection(String name){
        valid = false;
        time = 0;
        this.name = name;
        cp = ConnectionPool.CreateInstance();
        System.out.println(name+" olusturuldu..");
    }

    public String getName() {
        return name;
    }
    
    
    
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    
    public void Open(){
       
        time = System.currentTimeMillis();
        System.out.println("Baglanti açıldı....");
        valid = true;
    }
    
    public void Execute(String command) {
        if(valid){
            System.out.println(name+" isimli baglanti "+ command + " komutunu çalıştırdı");
        }
        
        else{
            new Exception("Baglı degil hatası...");
        }
    }
    
    
    public void Close() {
        
        if(valid){
            valid = false;
            long last_time = System.currentTimeMillis() - time;
            System.out.println(name+"isimli baglanti  kapatildi... Baglanti Suresi: "+(last_time/1000)+" s");
            cp.ReleaseConnection(this);
        }
        
        else{
            new Exception("Baglanti yok hatası...");
        }
        
        
    }
    
}
