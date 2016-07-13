package com.ian.spring.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class NewsDaoImpl implements NewsDao{ 

	private DataSource ds;
	
	public void setDs(DataSource ds){
		this.ds = ds;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void insert(String title, String content){
		
		JdbcTemplate jt = new JdbcTemplate(ds);
		jt.update("insert into news_inf"
				+ " values(null, ?, ?)", title, content);
		
//		jt.update("insert into news_inf"
//				+ " values(null, ?, ?)", title, content);
	}
}
