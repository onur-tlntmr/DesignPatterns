

/**
 * @author Onur
 * @version 1.0
 * @created 04-Eki-2018 23:15:27
 */
public class SQLCommand extends Command {

	protected String Query;

	public SQLCommand(){
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void Execute(){
            System.out.println("T_SQL Calisti");
	}

	public String getQuery(){
		return Query;
	}

	/**
	 * 
	 * @param query
	 */
	public void setQuery(String query){
            Query = query;
	}

}