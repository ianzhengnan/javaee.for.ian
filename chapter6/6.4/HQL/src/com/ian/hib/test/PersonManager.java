package com.ian.hib.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ian.hib.domain.Person;
import com.mysql.jdbc.PingTarget;

import java.text.SimpleDateFormat;
import java.time.chrono.JapaneseChronology;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PersonManager {

	public static void main(String[] args) throws Exception{
		
		PersonManager personManager = new PersonManager();
		personManager.findPersons();
		personManager.findPersonsByHappenDate();
		personManager.findPersonProperty();
		HibernateUtil.sessionFactory.close();
	}
	
	private void findPersonProperty() {
		
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		List pList = session.createQuery("select distinct p.id, p.name, p.age "
				+ "from Person p join "
				+ "p.myEvents")
				.list();
		
		System.out.println(pList);
		
		for (Iterator pIterator = pList.iterator(); pIterator.hasNext();) {
			Object[] objs = (Object[])pIterator.next();
			System.out.println(java.util.Arrays.toString(objs));
		}
		
		try{
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
		}
	}

	private void findPersonsByHappenDate() throws Exception{
		
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date start = simpleDateFormat.parse("2005-01-01");
		System.out.println("系统开始通过日期找人" + start);
		List pList = session.createQuery("select distinct p from Person p "
				+ "inner join p.myEvents event where event.happenDate "
				+ "between :firstDate and :endDate")
				.setDate("firstDate", start)
				.setDate("endDate", new Date())
				.list();
		
		System.out.println(pList);
		
		//遍历结果
		for (Iterator pIterator = pList.iterator(); pIterator.hasNext();) {
			Person person = (Person)pIterator.next();
			System.out.println(person.getName());
		}
		
		try{
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
		}
	}

	private void findPersons(){
		
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		/*List pList = session.createQuery("select distinct p.name from Person p "
				+ "join p.myEvents where title = :eventTitle")
				.setString("eventTitle", "很普通事情")
//				.setFirstResult(2)
//				.setMaxResults(1)
				.list();
		
		System.out.println(pList);
		for(Iterator pit = pList.iterator(); pit.hasNext();){
//			Person person = (Person)pit.next();
			String personName = (String)pit.next();
			System.out.println(personName);
//			System.out.println(person.getName() + " : " + person.getEmails());
		}*/
		
//		List pList = session.createQuery("select max(p.age) from Person p")
//				.list();
		
		List pList = session.createQuery("select p.name || '-' || p.age from Person p")
				.list();
		
		System.out.println(pList);
		
		try{
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
		}
	}
}
