
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
public class ConnectionPool {
    private static ConnectionPool cp;
    private final ArrayList<Connection> using_connections;
    private final ArrayList<Connection> avaible_connections;
    private final int SIZE=10 ;

    private ConnectionPool() {
        
        using_connections = new ArrayList<>();
        avaible_connections = new ArrayList<>();
        for(int i=0;i<SIZE;i++){
            avaible_connections.add(new Connection("Connection "+i));
            
        }
        
    }
    
    public static ConnectionPool CreateInstance(){
        if(cp == null){
            cp = new ConnectionPool();
        }
        return cp;
    }
    
    
    public Connection getConnection() throws Exception {
         
        if(!avaible_connections.isEmpty()){
            Connection c = avaible_connections.get(0);
            avaible_connections.remove(0);
            using_connections.add(c);
            return c;
         }
        throw new Exception("Boyut yetersiz..");
   }
    
    
    
    public void ReleaseConnection(Connection c){
        using_connections.remove(c);
        avaible_connections.add(c);
        System.out.println(c.getName()+" tekrar kullanılabilinir.");
    }
    
    public int getAvaibleConnection(){
        return avaible_connections.size();
    }
    
    public static void main(String[] args) {
        ConnectionPool cp = ConnectionPool.CreateInstance();
    }
    
}
