package generique;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AvionDAO implements DAO<Avion> {
	Connection con = Connecter.maConnexion();
	String sql;
	Statement st=null;
	@Override
	public void save(Avion p) {
       sql = "insert into avion   values('"+p.getAVNUM()+"','"+p.getAVNOM()+"','"+p.getCAPACITE()+"','"+p.getVILLE()+"')";
		
		try {
			st = con.createStatement();
			int nb = st.executeUpdate(sql);
			if(nb!=0){
				System.out.println("avion inserted correcty !");
			}
			else{
				System.out.println("error insertion");
			}
			
		} catch (SQLException ex) {
			System.out.println(ex);
		}
		
	}
	@Override
	public void remove(Avion p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Update(Avion p) {
		
		
	}
	@Override
	public void FindPerson(Avion p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Avion> getAllAvion() {
		return null;
	}
	@Override
	public void afficherall() {
		try{
			sql=" select * from avion";
			st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			List<Avion> lp=new ArrayList<Avion>();
			while(rs.next()){
			int avnum = rs.getInt("AVNUM");
			String avnom = rs.getString("AVNOM");
			int capacite = rs.getInt("CAPACITE");
			String ville = rs.getString("VILLE");
			System.out.println("AVNUM : "+ avnum + " , AVNOM : " + avnom + " , CAPACITE : "+ capacite + " , VILLE : " + ville);
			}
			}
			catch(Exception e){
			}
	}

}
