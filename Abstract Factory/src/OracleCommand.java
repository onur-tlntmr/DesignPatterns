

/**
 * @author Onur
 * @version 1.0
 * @created 04-Eki-2018 23:15:27
 */
public class OracleCommand extends Command {

	protected String Query;

	public OracleCommand(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void Execute(){
            System.out.println("PL/SQL Calisti");
	}

	public String getQuery(){
		return "";
	}

	/**
	 * 
	 * @param query
	 */
	public void setQuery(String query){

	}

}