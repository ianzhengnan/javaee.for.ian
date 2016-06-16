package com.ian.action.upload;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;


public class UploadAction extends ActionSupport{

	private String title;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;

	public void setSavePath(String value){
		this.savePath = value;
	}
	public String getSavePath() throws Exception{
		return ServletActionContext.getServletContext()
			.getRealPath(savePath);
	}

	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}

	public void setUpload(File upload){
		this.upload = upload;
	}
	public File getUpload(){
		return upload;
	}

	public void setUploadContentType(String uploadContentType){
		this.uploadContentType = uploadContentType;
	}
	public String getUploadContentType(){
		return uploadContentType;
	}

	public void setUploadFileName(String uploadFileName){
		this.uploadFileName = uploadFileName;
	}
	public String getUploadFileName(){
		return uploadFileName;
	}

	@Override
	public String execute() throws Exception{

		FileOutputStream fos = new FileOutputStream(getSavePath()
			+ "\\" + getUploadFileName());
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while((len = fis.read(buffer)) > 0){
			fos.write(buffer, 0, len);
		}
		fos.close();
		return SUCCESS;
	}
}