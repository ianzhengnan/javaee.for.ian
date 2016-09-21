package com.ian.rest.exp.service;

import java.util.List;

import com.ian.rest.exp.model.Article;

public interface ArticleMgr {

	/**
	 * get article by id
	 * @param id
	 * @return
	 */
	Article get(String id);
	
	/**
	 * get all articles
	 * @return
	 */
	List<Article> getAll();
	
	/**
	 * save article
	 * @param article
	 */
	void save(Article article);
	
	/**
	 * remove article
	 * @param id
	 */
	void remove(String id);

}
