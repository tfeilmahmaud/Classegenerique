package generique;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class VolDAO implements DAO<Vol>{
	Connection con = Connecter.maConnexion();
	String sql;
	Statement st=null;
	@Override
	public void save(Vol p) {
		// TODO Auto-generated method stub
	}
	@Override
	public void remove(Vol p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Update(Vol p) {
		
		
	}
	@Override
	public void FindPerson(Vol p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Vol> getAllAvion() {
			return null;
			}
	@Override
	public void afficherall() {
		try{
			sql=" select * from vol where VILLEDEP='PARIS'";
			st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
			int volnum = rs.getInt("VOLNUM");
			int plnum = rs.getInt("PLNUM");
			int avnum = rs.getInt("AVNUM");
			String villedep = rs.getString("VILLEDEP");
			String villearr = rs.getString("VILLEARR");
			int heuredep = rs.getInt("HEUREDEP");
			int heurearr = rs.getInt("HEUREARR");
			System.out.println("VOLNUM : "+ volnum + " , PLNUM : " + plnum + " , AVNUM : "+ avnum + " , VILLEDEP : " + villedep  + " , VILLEARR : "+ villearr + " , HEUREDEP : " + heuredep  + " , HEUREARR : " + heurearr);
			}
			}
			catch(Exception e){
			}
		
	}
}
