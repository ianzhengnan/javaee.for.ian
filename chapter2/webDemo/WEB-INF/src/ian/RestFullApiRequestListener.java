package ian;

import javax.servlet.annotation.WebListener;
import javax.servlet.ServletRequestListener;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;


public class RestFullApiRequestListener implements ServletRequestListener, ServletRequestAttributeListener{

	public void requestInitialized(ServletRequestEvent sre){

		HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
		System.out.println("-----send to:" + request.getRequestURI()
			+ " request is initialized.");
	}

	public void requestDestroyed(ServletRequestEvent sre){

		HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
		System.out.println("-----send to:" + request.getRequestURI()
			+ " request is destroied.");
	}

	public void attributeAdded(ServletRequestAttributeEvent event){

		ServletRequest request = event.getServletRequest();
		String name = event.getName();
		Object value = event.getValue();

		System.out.println(request + " added name is " + name + " value is " + value);
	}

	public void attributeRemoved(ServletRequestAttributeEvent event){

		ServletRequest request = event.getServletRequest();
		String name = event.getName();
		Object value = event.getValue();

		System.out.println(request + " deleted name is " + name + " value is " + value);
	}

	public void attributeReplaced(ServletRequestAttributeEvent event){

		ServletRequest request = event.getServletRequest();
		String name = event.getName();
		Object value = event.getValue();

		System.out.println(request + " changed name is " + name + " value is " + value);
	}
}