package ian;

import javax.servlet.ServletRequest;
import javax.servlet.AsyncContext;

import java.util.List;
import java.util.ArrayList;


public class Executor implements Runnable{

	private AsyncContext asx = null;
	public Executor(AsyncContext asx){
		this.asx = asx;
	}

	public void run(){
		try{
			Thread.sleep(5 * 1000);
			ServletRequest request = asx.getRequest();
			List<String> books = new ArrayList<String>();
			books.add("疯狂Java讲义");
			books.add("轻量级Javaee实战");
			books.add("企业级Javaee实战");
			request.setAttribute("books", books);
			System.out.println(books);
			asx.dispatch("/async.jsp");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}