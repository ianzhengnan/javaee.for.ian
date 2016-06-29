package com.ian.hib.test;

import org.hibernate.CacheMode;
import org.hibernate.HibernateException;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ian.hib.domain.User;

public class UserManager {

	public static void main(String[] args) throws Exception{
		
		UserManager uManager = new UserManager();
//		uManager.batchInsert();
//		uManager.batchUpdate();
//		uManager.updateUsers();
		uManager.deleteUsers();
		HibernateUtil.sessionFactory.close();
	}
	
	public void batchInsert() {
		
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		for (int i = 0; i < 1000; i++) {
			
			User user = new User();
			user.setName("xxxx" + i);
			user.setNationality("China");
			session.save(user);
			
			if (i % 20 == 0) {
				session.flush();
				session.clear();
			}
		}
		
		try{
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
		}
	}
	
	public void batchUpdate(){
		
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		ScrollableResults users = session.createQuery("from User")
				.setCacheMode(CacheMode.IGNORE)
				.scroll(ScrollMode.FORWARD_ONLY);
		
		int count = 0;
		
		while(users.next()){
			User user = (User)users.get(0);
			user.setName("新用户名" + count);
			if (++count % 20 == 0) {
				session.flush();
				session.clear();
			}
		}
		
		try{
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
		}
	}
	
	public void updateUsers(){
		
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		
		String hqlUpdate = "update User set name = :newName";
		
		int updateEntities = session.createQuery(hqlUpdate)
				.setString("newName", "卡卡")
				.executeUpdate();
		
		System.out.println(updateEntities);
		
		try{
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
		}
	}
	
	public void deleteUsers(){
		
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		String hqlDelete = "delete User";
		
		int deletedEntities = session.createQuery(hqlDelete)
				.executeUpdate();
		
		System.out.println(deletedEntities);
		
		try{
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
		}
	}
}
