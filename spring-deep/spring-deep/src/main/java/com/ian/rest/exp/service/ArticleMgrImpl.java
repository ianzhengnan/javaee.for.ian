package com.ian.rest.exp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ian.rest.exp.model.Article;

public class ArticleMgrImpl implements ArticleMgr{

	private static int nextId = 5;
	private static Map<String, Article> articles = new HashMap<String, Article>();
	
	static {
		articles.put("1", new Article("1","first", "ianzheng", "hello, ian. this is the first one."));
		articles.put("2", new Article("2","second", "flks555", "hello, flks555. this is the second one."));
		articles.put("3", new Article("3","third", "kaka", "hello, kaka. this is the third one."));
	}
	
	public Article get(String id) {
		return articles.get(id);
	}

	public List<Article> getAll() {
		return new ArrayList<Article>(articles.values());
	}

	public void save(Article article) {
		if (article.getId() != null) {
			articles.replace(article.getId(), article);			
		}else{
			article.setId(String.valueOf(nextId));
			articles.put(String.valueOf(nextId++), article);
		}
	}
	
	public void remove(String id) {
		articles.remove(id);
	}

}
