package com.ian.action.comment;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.json.annotations.JSON;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class HandleComments {

	private List<Comment> comments = new ArrayList<Comment>();
	private Map<String, String> returnCode = new HashMap<String, String>();


	public List getComments(){
		return comments;
	}

	public Map getReturnCode(){
		return returnCode;
	}

	public String doGet() throws Exception{

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pass = "1234567";

		Class.forName(driver);

		try(
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from comments");
		){
			while(rs.next()){
				comments.add(new Comment(rs.getString(1), rs.getString(2), rs.getString(3)));
			}	
		}
		returnCode.put("status", "ok");
		return Action.SUCCESS;
	}


	public String doPost() throws Exception{


		//get paramaters
		ActionContext ac = ActionContext.getContext();

		Map<String, Object> params = ac.getParameters();
		System.out.println(params);

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pass = "1234567";

		Class.forName(driver);

		try(
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement pstmt = conn.prepareStatement("insert into comments values(?,?,?)");
		){
			pstmt.setString(1, ((String[])params.get("id"))[0]);
			pstmt.setString(2, ((String[])params.get("author"))[0]);
			pstmt.setString(3, ((String[])params.get("text"))[0]);

			pstmt.executeUpdate();
		}

		returnCode.put("status", "ok");
		return Action.SUCCESS;
	}

}