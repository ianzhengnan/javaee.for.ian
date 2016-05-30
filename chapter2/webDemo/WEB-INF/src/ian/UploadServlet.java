package ian;

import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Collection;

@WebServlet(urlPatterns={"/upload"}, name="upload")
@MultipartConfig
public class UploadServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String fileName = request.getParameter("name");

		Part part = request.getPart("file");

		out.println("上传文件的类型是：" + part.getContentType() + "<br/>");
		out.println("上传文件的大小是：" + part.getSize() + "<br/>");

		Collection<String> headerNames = part.getHeaderNames();
		for (String headerName : headerNames) {
			out.println(headerName + "--->" 
				+ part.getHeader(headerName) + "<br/>");
		}
		System.out.println(getServletContext().getRealPath("/uploadFiles") + "/" + fileName);
		part.write(getServletContext().getRealPath("/uploadFiles") + "/" + fileName);
	}

}
