

/**
 * @author Onur
 * @version 1.0
 * @created 04-Eki-2018 23:15:27
 */
public class OracleConnection extends Connection {

	protected String ConnectionString;

	public OracleConnection(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void Connect(){
            System.out.println("Oracle Connection baglandi..");
	}

	public String getConnectionString(){
		return ConnectionString;
	}

	/**
	 * 
	 * @param cstr
	 */
	public void setConnectionString(String cstr){
            this.ConnectionString = cstr;
	}

}