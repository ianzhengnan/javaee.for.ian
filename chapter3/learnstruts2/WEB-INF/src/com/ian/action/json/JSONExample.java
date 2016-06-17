package com.ian.action.json;

import java.util.Map;
import java.util.HashMap;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.json.annotations.JSON;

public class JSONExample {

	private Map<String, String> map = new HashMap<String, String>();

	private String customName = "顾客";
	private String field1;
	private transient String field2;
	private String field3;

	public String execute() throws Exception{

		map.put("name", "疯狂Java讲义");
		return Action.SUCCESS;
	}

	@JSON(name="newName")
	public Map getMap(){
		return this.map;
	}

	public void setCustomName(String customName){
		this.customName = customName;
	}
	public String getCustomName(){
		return customName;
	}

	public void setField1(String field1){
		this.field1 = field1;
	}
	public String getField1(){
		return field1;
	}

	public void setField2(String field2){
		this.field1 = field1;
	}
	public String getField2(){
		return field2;
	}

	public void setField3(String field3){
		this.field3 = field3;
	}
	public String getField3(){
		return field3;
	}
}