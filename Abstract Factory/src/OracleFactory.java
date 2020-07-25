

/**
 * @author Onur
 * @version 1.0
 * @created 04-Eki-2018 23:15:27
 */
public class OracleFactory extends DBFactory {

	public OracleFactory(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Command CreateCommand(){
		return new OracleCommand();
	}

	public Connection CreateConnection(){
		return new OracleConnection();
	}

}