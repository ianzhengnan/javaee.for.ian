package ian;

import com.ian.hib.related.Person;
import com.ian.hib.related.Address;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPerson {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration().configure();
		
		SessionFactory sessionFactory = conf.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Person p = new Person();
		p.setName("Kaka");
		p.setAge(30);
		session.save(p);
		
//		p.getAddresses().add(a1);
		Address a1 = new Address("申滨路1051弄123号304室");
		a1.setPerson(p);
		session.persist(a1);


		Address a2 = new Address("申滨路1051弄112号1101室");
		a2.setPerson(p);
		session.persist(a2);
		
		tx.commit();
		
		session.close();
		sessionFactory.close();
	}
}
