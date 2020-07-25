

/**
 * @author Onur
 * @version 1.0
 * @created 04-Eki-2018 23:15:27
 */
public class SQLFactory extends DBFactory {

	public SQLFactory(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Command CreateCommand(){
		return new SQLCommand();
	}

	public Connection CreateConnection(){
            return new SQLConnection();
        }

}