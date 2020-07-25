

/**
 * @author Onur
 * @version 1.0
 * @created 04-Eki-2018 23:15:27
 */
public abstract class Connection {

	protected String ConnectionString;

	public Connection(){

	}

	public void finalize() throws Throwable {

	}

	public abstract void Connect();

	public abstract String getConnectionString();

	/**
	 * 
	 * @param cstr
	 */
	public abstract void setConnectionString(String cstr);

}