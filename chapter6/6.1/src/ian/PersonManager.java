package ian;

import com.ian.hib.related.Person;
import com.ian.hib.related.Address;

import org.hibernate.Transaction;
import org.hibernate.Session;

public class PersonManager{

	public static void main(String[] args) throws Exception{
			
		PersonManager mgr = new PersonManager();
		mgr.testPerson();
		HibernateUtil.sessionFactory.close();
	}

	public void testPerson(){

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		Person p = new Person();
		p.setName("张三");
		p.setAge(21);
		session.save(p);
		
//		p.getAddresses().add(a1);
		Address a1 = new Address("申滨路1051弄123号111室");
		a1.setPerson(p);
		session.persist(a1);


		Address a2 = new Address("申滨路1051弄112号210室");
		a2.setPerson(p);
		session.persist(a2);

		tx.commit();
		HibernateUtil.closeSession();

	}
}