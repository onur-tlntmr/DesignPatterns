

/**
 * @author Onur
 * @version 1.0
 * @created 04-Eki-2018 23:15:27
 */
public abstract class DBFactory {

	public DBFactory(){

	}

	

	public abstract Command CreateCommand();

	public abstract Connection CreateConnection();

}