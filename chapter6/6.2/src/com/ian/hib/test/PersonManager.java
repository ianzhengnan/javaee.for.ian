package com.ian.hib.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ian.hib.domain.Address;
import com.ian.hib.domain.Customer;
import com.ian.hib.domain.Employee;
import com.ian.hib.domain.Manager;

import com.ian.hib.domain.Person;

public class PersonManager {

	public static void main(String[] args) throws Exception{
		
		PersonManager mgr = new PersonManager();
		mgr.testPerson();
		HibernateUtil.sessionFactory.close();
	}

	public void testPerson(){

		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Employee zhu = new Employee();
		zhu.setName("老朱");
		zhu.setTitle("项目组长");
		zhu.setGender('男');
		zhu.setSalary(4500);
		zhu.setAddress(new Address("广州","234567", "中国"));
		
		Employee zhang = new Employee();
		zhang.setName("张美丽");
		zhang.setTitle("项目分析");
		zhang.setGender('女');
		zhang.setSalary(5500);
		zhang.setAddress(new Address("广州","231231","中国"));
		
		Manager grace = new Manager();
		grace.setName("Grace");
		grace.setTitle("项目经理");
		grace.setGender('女');
		grace.setSalary(12000);
		grace.setAddress(new Address("加州", "1231231", "美国"));
		grace.setDepartment("研发部");
		
		zhang.setManager(grace);
		
		Customer he = new Customer();
		he.setName("小呵");
		he.setGender('男');
		he.setAddress(new Address("湖南","123132","中国"));
		he.setComments("喜欢购物");
		he.setEmployee(grace);
		
		Person ian = new Person();
		ian.setName("郑楠");
		ian.setGender('男');
		ian.setAddress(new Address("上海", "210000", "中国"));
		
		session.save(ian);
		session.save(grace);
		session.persist(zhu);
		session.persist(zhang);
		session.save(he);
		
		try{
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
		}
	}
	
}
