package generique;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
public class PiloteDAO implements DAO<Pilote>{
	Connection con = Connecter.maConnexion();
	String sql;
	Statement st=null;
	@Override
	public void save(Pilote p) {
       sql = "insert into pilote  values('"+p.getPLNUM()+"','"+p.getPLNOM()+"','"+p.getPLPRENOM()+"','"+p.getVILLE()+"','"+p.getSALAIRE()+"')";
		
		try {
			st = con.createStatement();
			int nb = st.executeUpdate(sql);
			if(nb!=0){
				System.out.println("pilote inserted correcty !");
			}
			else{
				System.out.println("error insertion");
			}
			
		} catch (SQLException ex) {
			System.out.println(ex);
		}
		
	}
	@Override
	public void remove(Pilote p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Update(Pilote p) {
		try {
			sql ="update pilote set SALAIRE ='"+p.getSALAIRE() * 0.20 +"' where SALAIRE <18000";
			st = con.createStatement();
			int nb = st.executeUpdate(sql);
			if(nb!=0){
				System.out.println("person update correcty !");
			}
			else{
				System.out.println("update error");
			}
			
		} catch (SQLException ex) {
			System.out.println(ex);
		}
		
	}
	@Override
	public void FindPerson(Pilote p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Pilote> getAllAvion() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void afficherall() {
		try{
			sql=" select * from vol v where v.PLNUM in(select PLNUM from pilote where PLNOM='MIRANDA')";
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
