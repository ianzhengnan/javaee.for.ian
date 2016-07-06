package ian.test;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ian.hib.domain.News;

public class SecondLevelCacheTest {

	static Configuration conf = new Configuration().configure();
	
	static SessionFactory sf = conf.buildSessionFactory();
	
	public static void main(String[] args) {
		
		SecondLevelCacheTest test = new SecondLevelCacheTest();
		test.secondCacheTest();
		test.stat();
	}

	private void secondCacheTest() {
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		List names = session.createQuery("from News news")
				.list();
		session.getTransaction().commit();
		System.out.println("-----------------------------");
		
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		
		News news = (News)session2.load(News.class, 1);
		System.out.println(news.getTitle());
		session2.getTransaction().commit();
	}
	
	private void stat(){
		Map cacheEntities = sf.getStatistics()
				.getSecondLevelCacheStatistics("com.ian.hib.domain.News")
				.getEntries();
		
		System.out.println(cacheEntities);
	}
}
