package inno;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class Prueba implements IServicio {

	public Map<Integer, Mitablaform> cargaDatos() 
	{

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("inno");
		EntityManager em = emf.createEntityManager();
		
		Config cfg = new Config();
		HazelcastInstance instance = Hazelcast.newHazelcastInstance(cfg);
		Map<Integer, Mitablaform> mapa = instance.getMap("tabla");
		
		try 
		{
			Query query = em.createQuery("SELECT e FROM Mytable e");
			List<Mytable> lm = query.getResultList();

			Iterator it = lm.iterator();
			Mitablaform mtf = new Mitablaform();
			int i= 0;
			while (it.hasNext())
			{
				mtf.setCompany(lm.get(i).getCompany());
				mtf.setIban(lm.get(i).getIban());
				mtf.setName(lm.get(i).getName());
				mtf.setPhone(lm.get(i).getPhone());
				
				mapa.put(lm.get(i).getId(), mtf);
				
				i++;
			}
			
			
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			em.close();
			
		}
		return mapa;
		
	}

}
