package ian;

import javax.servlet.annotation.WebFilter;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;

import java.io.IOException;


@WebFilter(filterName="RestFullApiFilter", urlPatterns={"/api/comments"})
public class RestFullApiFilter implements Filter{

	private FilterConfig config;

	public void init(FilterConfig config) throws ServletException{
		this.config = config;
	}

	public void destroy(){
		this.config = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException{

		HttpServletRequest req = (HttpServletRequest)request;
		if (req.getMethod() == "POST") {

			String author = req.getParameter("author");
			System.out.println(author);
			
			if (author != null && author.equals("Ian")) {
				System.out.println("this user cannot post comments!");
			}else{
				chain.doFilter(request, response);
			}
		
		}else{
			chain.doFilter(request, response);
		}
		
	}

}