package ian;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class BeforeListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce){
		System.out.println("----------------beforemodel模块被加载了-----------------------");
	}
	public void contextDestroyed(ServletContextEvent sce){

	}
}