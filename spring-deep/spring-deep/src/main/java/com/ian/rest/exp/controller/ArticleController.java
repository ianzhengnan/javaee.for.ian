package com.ian.rest.exp.controller;

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ian.rest.exp.model.Article;
import com.ian.rest.exp.service.ArticleMgr;
import com.ian.rest.exp.service.ArticleMgrImpl;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Validateable;
import com.opensymphony.xwork2.ValidationAwareSupport;


@Results({
	@Result(name="success", type="redirectAction", params={"actionName", "article"})
})
public class ArticleController extends ValidationAwareSupport implements ModelDriven<Object>, Validateable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger log = LoggerFactory.getLogger(ArticleController.class);
	
	private Article article = new Article();
	private String id;
	private List<Article> list;
	private ArticleMgr articleMgr = new ArticleMgrImpl();
	private String _method;
	
	// GET /article/1
	public HttpHeaders show(){
		return new DefaultHttpHeaders("show");
	}
	
	// GET /article
	public HttpHeaders index() {
		list = articleMgr.getAll();
		return new DefaultHttpHeaders("index")
				.disableCaching();
	}
	
	// GET /article/1/edit
	public String edit(){
		return "edit";
	}
	
	// GET /article/new
	public String editNew(){
		article = new Article();
		return "editNew";
	}
	
	// DELETE /article/1
	public String destroy(){
		log.info("Delete article with id: {}", id);
		articleMgr.remove(id);
		return "success";
	}
	
	// POST /article
	public HttpHeaders create(){
		log.info("Create new article {}", article);
		articleMgr.save(article);
		addActionMessage("New article created successfully");
		return new DefaultHttpHeaders("success")
				.setLocationId(article.getId());
	}
	
	// PUT /article/1
	public String update(){
		articleMgr.save(article);
		addActionMessage("Article updated successfully");
		return "success";
	}
	
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id != null) {
			this.article = articleMgr.get(id);
		}
		this.id = id;
	}

	public List<Article> getList() {
		return list;
	}

	public void setList(List<Article> list) {
		this.list = list;
	}

	public void setArticleMgr(ArticleMgr articleMgr) {
		this.articleMgr = articleMgr;
	}

	public void validate() {
		if (article.getSubject() == null || article.getSubject().length() == 0) {
			addFieldError("subject", "The subject is empty");
		}
	}

	public Object getModel() {
		return (list != null ? list : article);
	}

	public String get_method() {
		return _method;
	}

	public void set_method(String _method) {
		this._method = _method;
	}

}
