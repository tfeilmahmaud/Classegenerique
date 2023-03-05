package generique;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connecter {
	public static String url= "jdbc:mysql://localhost:3306/vols";
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static Connection con=null;
	
	
	Connecter(){
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, "root", "");
	}catch (ClassNotFoundException |SQLException e) {
		System.out.println(e);
	}
	}

	public static Connection maConnexion(){
		if(con==null){
			new Connecter();
		}
		
		return con;
	}

}
