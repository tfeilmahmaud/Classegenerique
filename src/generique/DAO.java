package generique;
import java.util.List;
public interface DAO<T> {
	void save(T p);
	void remove(T p);
	void Update(T p);
	void FindPerson(T p);
	List<T> getAllAvion();
	void afficherall();


}
