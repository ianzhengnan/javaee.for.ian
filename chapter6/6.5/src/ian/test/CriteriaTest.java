package ian.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.ian.hib.domain.Enrolment;
import com.ian.hib.domain.Student;

public class CriteriaTest {

	public static void main(String[] args) {
		
		CriteriaTest criteriaTest = new CriteriaTest();
		criteriaTest.query();
		HibernateUtil.closeSession();
		
	}

	private void query() {
		
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		List pList = session.createCriteria(Student.class)
				.add(Restrictions.gt("name", "a"))
				.list();
		
		Iterator iterator = pList.iterator();
		System.out.println("=====简单条件查询获取所有学生的记录=====");
		while (iterator.hasNext()) {
			Student student = (Student)iterator.next();
			System.out.println(student.getName());
			Set enrolments = student.getEnrolments();
			Iterator iterator2 = enrolments.iterator();
			System.out.println("=====获取-" + student.getName()
					+ "-的选课记录=====");
			while (iterator2.hasNext()) {
				Enrolment enrolment = (Enrolment)iterator2.next();
				System.out.println(enrolment.getCourse().getName());
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
}
