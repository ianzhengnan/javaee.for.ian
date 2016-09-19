package com.ian.rest.exp;

import java.util.ArrayList;
import java.util.List;


//import org.apache.struts2.convention.annotation.Result;
//import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.ian.spring.app.jpa.domain.Person;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Validateable;

//对于基于convention的action, 下面的配置不是必须的
//@Results({
//	@Result(name="success", type="redirectAction", params = {"actionName", "kaka"})
//})
public class TestController implements ModelDriven<Object>, Validateable{

	private Person person = new Person(1,"郑楠", 34);
	private List<Person> list = new ArrayList<Person>();
	
	private String id;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 必须提供getList方法，不然jsp无法获取它的值， 因为它是私有的
	 * @return
	 */
	public List<Person> getList() {
		return list;
	}
	public void setList(List<Person> list) {
		this.list = list;
	}
	public HttpHeaders show(){
		return new DefaultHttpHeaders("show");
	}
	
	public HttpHeaders index(){
		
		list.add(new Person(1,"郑楠", 34));
		list.add(new Person(2,"卡卡", 23));
		list.add(new Person(3,"菲丽克斯", 44));
		return new DefaultHttpHeaders("index")
				.disableCaching();
	}

	public String editNew(){
		person = new Person();
		return "editNew";
	}
	
	public Object getModel() {
		return (list != null ? list : person);
	}
	public void validate() {
		if (person.getName() == null) {
//            addFieldError("clientName", "The client name is empty");
        }
	}
	
	
}
