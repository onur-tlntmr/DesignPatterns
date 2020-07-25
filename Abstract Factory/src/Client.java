/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Client {
    public static void main(String[] args) {
        DBFactory db = FactoryUtil.GetFactory("SQL");
        
        Connection cnn = db.CreateConnection();
        cnn.Connect();
        Command cmd = db.CreateCommand();
        cmd.Query = "SELECT * FROM TABLO";
        cmd.Execute();
        
        
        
        db = FactoryUtil.GetFactory("Oracle");
        cnn = db.CreateConnection();
        cnn.Connect();
        cmd = db.CreateCommand();
        cmd.setQuery("SELECT * FROM TABLO");
        cmd.Execute();
        
        
    }
}
