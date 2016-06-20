package com.ian.hib.test;

import com.ian.hib.demo.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserTest{

	public static void main(String[] args) throws Exception {
		
		Configuration cfg = new Configuration().configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session sess = sf.openSession();

		Transaction tx = sess.beginTransaction();

		User ian = new User();
		ian.setName("飞翔");
		ian.setAge(34);

		sess.save(ian);

		tx.commit();

		sess.close();
		sf.close();

	}
}