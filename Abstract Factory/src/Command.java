



/**
 * @author Onur
 * @version 1.0
 * @created 04-Eki-2018 23:15:27
 */
public abstract class Command {

	protected String Query;

	public Command(){

	}

	public void finalize() throws Throwable {

	}

	public abstract void Execute();

	public abstract String getQuery();

	/**
	 * 
	 * @param query
	 */
	public abstract void setQuery(String query);

}