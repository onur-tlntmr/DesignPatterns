
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public abstract class Araba  {
    public Markalar marka;
    private String model;
    private ArrayList<String> opsiyonel_parcalar;
    protected ArrayList<String> zorunlu_parcalar;

    public String getModel() {
        return model;
    }

    public ArrayList<String> getOpsiyonel_parcalar() {
        return opsiyonel_parcalar;
    }

    public void setOpsiyonel_parcalar(ArrayList<String> opsiyonel_parcalar) {
        this.opsiyonel_parcalar = opsiyonel_parcalar;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public Araba(){
        zorunlu_parcalar = new ArrayList<>();
        opsiyonel_parcalar = new ArrayList<>();
        String zs[] = {"Krank mili","Direksiyon","Şase","Şanzıman","Motor"};
       
         zorunlu_parcalar.addAll(Arrays.asList(zs));
        
        
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s\n\r",marka,model ));
        
        sb.append("Zorunlu Parçalar\n");
        for(String s : zorunlu_parcalar){
            sb.append(s+"\n\r");
        }
        sb.append("Opsiyonel Parçalar\n\r");
        for(String s: opsiyonel_parcalar){
            sb.append(s+"\n\r");
        }
        
        return sb.toString();
        
    }
    
}
