package ian;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.AsyncContext;

import java.io.PrintWriter;
import java.io.IOException;


@WebServlet(urlPatterns="/async", asyncSupported=true)
public class AsyncServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException{

			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<title>异步调用实例</title>");
			out.println("进入Servlet的时间：" + new java.util.Date() + ".<br/>");
			out.flush();

			AsyncContext asx = request.startAsync();
			asx.addListener(new MyAsyncListener());
			asx.setTimeout(30 * 1000);
			asx.start(new Executor(asx));

			out.println("结束Servlet的时间：" + new java.util.Date() + ".<br/>");
			// flush作用是什么？
			out.flush();
	}
}