package com.ian.action.download;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

public class DownloadFileAction extends ActionSupport{

	private String inputPath;

	public void setInputPath(String value){
		this.inputPath = value;
	}

	public InputStream getTargetFile() throws Exception{
		return ServletActionContext.getServletContext()
			.getResourceAsStream(inputPath);
	}

}