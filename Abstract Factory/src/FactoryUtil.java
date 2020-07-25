

/**
 * @author Onur
 * @version 1.0
 * @created 04-Eki-2018 23:15:27
 */
public class FactoryUtil {

	public FactoryUtil(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param db_name
	 */
	public static DBFactory GetFactory(String db_name){
            
            if(db_name.equals("SQL")){
                return new SQLFactory();
            }
            
            
            else if(db_name.equals("Oracle")){
                return new OracleFactory();
            }
            
            return null;
            
	}

}