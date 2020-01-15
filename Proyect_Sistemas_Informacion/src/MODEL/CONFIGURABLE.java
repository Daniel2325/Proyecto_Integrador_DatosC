package MODEL;

import java.sql.*;

public interface CONFIGURABLE {
	public final String user = "postgres";
	public final String psw = "server2019";
	public final String bd = "DIM_DIVORCIOS";
	public final String driver = "org.postgresql.Driver";
	public final String ip = "172.17.42.52:5432";
	public final String url = "jdbc:postgresql://" + ip + "/" + bd + "";

	public abstract Connection cadenaConexion();

	public abstract void cerrarConexion();

}
