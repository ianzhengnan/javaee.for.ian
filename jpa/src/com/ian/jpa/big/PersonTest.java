package com.ian.jpa.big;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class PersonTest {

	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("qs");
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		EntityManager em = emf.createEntityManager();
		
		Person person = new Person();
		person.setName("郑楠");
		File file = new File("img.png");
		byte[] content = new byte[(int)file.length()];
		new FileInputStream(file).read(content);
		person.setPic(content);
		person.setBirth(new Date());
		try{
			em.getTransaction().begin();
			em.persist(person);
			em.getTransaction().commit();
		}finally{
			em.close();
		}
	}
}
