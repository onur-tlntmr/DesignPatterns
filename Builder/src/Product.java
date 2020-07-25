
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
class Product {
    private ArrayList<String> m_Parts = new ArrayList<>();
    void Add(String part) {
        m_Parts.add(part);
    }
    
    @Override
    public String toString(){
        String s = "Ürüne ait parçalar: \n\r";
        
        for(String part : m_Parts){
            s += part +"\n\r";
        }
        
        return s;
        
    }
    
    
    
}
