package ian;

import com.ian.hib.related.Person;
import com.ian.hib.test.HibernateUtil;
import com.ian.hib.related.Address;

import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
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

		//------create--------- 
		/*Person p = new Person();
		p.setName("伊泽");
		p.setAge(4);
		session.save(p);
		
//		p.getAddresses().add(a1);
		Address a1 = new Address("申滨路1051弄123号112室");
		a1.setPerson(p);
		session.persist(a1);

		Address a2 = new Address("申滨路1051弄112号211室");
		a2.setPerson(p);
		session.persist(a2);*/
		
		//------get, load, update, delete------
		
//		Person person = (Person)session.load(Person.class, new Integer(3));
		
		Person person = (Person)session.get(Person.class, new String("8abac7a75596a388015596a38be50000"));
		
//		Set<Address> addresses = (Set<Address>)person.getAddresses();
		
		System.out.println(person.getName());
		
		for (Address address : person.getAddresses()) {
			System.out.println(address.getAddressDetail());
		}
		
		// query
//		List persons = session.createQuery("from person_inf");
		
//		person.getAddresses().removeAll(addresses);
		
		
		//		person.setAge(120);
				
//		person.getAddresses().add(new Address("唐宁街1001号"));
//		session.update(person);
//		session.delete(person);
		
		//-----add address-----
		/*Address address = new Address("唐宁街1001号");
		address.setPerson(person);
		session.persist(address);*/
		
		// 如果有update, save, delete等语句，需要commit.如果只是get,load不需要
		try{
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
		}
	}
}