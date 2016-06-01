package ian;

// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.PrintStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class RestFullApiServlet extends HttpServlet{

	private String driver = "";
	private String url = "";
	private String user = "";
	private String pass = "";

	public void init(ServletConfig config)
		throws ServletException{

		super.init(config);
		driver = config.getInitParameter("driver");
		url = config.getInitParameter("url");
		user = config.getInitParameter("user");
		pass = config.getInitParameter("pass");

	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{

		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/json; charset=utf-8");

		try{
			Class.forName(driver);
		}catch(Exception e){
			e.printStackTrace();
		}

		try(
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from comments");
		){
			JsonArrayBuilder jb = Json.createArrayBuilder();
			while(rs.next()){

				jb.add(Json.createObjectBuilder()
					.add("id", rs.getString(1))
					.add("author", rs.getString(2))
					.add("text", rs.getString(3)));
			}

			JsonArray value = jb.build();

			PrintWriter out = res.getWriter();
			out.println(value.toString());

		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{

		String id = req.getParameter("id");
		String author = req.getParameter("author");
		String text = req.getParameter("text");

		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/json; charset=utf-8");

		try{
			Class.forName(driver);
		}catch(Exception e){
			e.printStackTrace();
		}

		try(
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstmt = conn.prepareStatement("insert into comments values(?,?,?)");
		){
			
			pstmt.setString(1, id);
			pstmt.setString(2, author);
			pstmt.setString(3, text);

			pstmt.executeUpdate();


			JsonObject obj = Json.createObjectBuilder().add("status", "ok").build();

			//方式一
			// PrintWriter out = res.getWriter();
			// out.println(obj.toString());
			//方式二
			PrintStream out = new PrintStream(res.getOutputStream());
			out.println(obj.toString());

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}