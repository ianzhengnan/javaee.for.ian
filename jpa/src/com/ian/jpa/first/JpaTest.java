package com.ian.jpa.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaTest {

	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("qs");
	
	public static void main(String[] args) {
		final EntityManager em = emf.createEntityManager();
		
		News news = new News();
		news.setTitle("疯狂javaee企业开发");
		news.setContent("疯狂javaee企业开发很有趣！");
		
		try{
			em.getTransaction().begin();
			em.persist(news);
			em.getTransaction().commit();
		}finally{
			em.close();
		}
	}
}
