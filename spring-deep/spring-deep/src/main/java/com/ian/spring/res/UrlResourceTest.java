package com.ian.spring.res;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.UrlResource;


public class UrlResourceTest {

	public static void main(String[] args) throws Exception{
		
//		UrlResource urs = new UrlResource("file:book.xml");
		UrlResource urs = new UrlResource("http://services.odata.org/V4/OData/OData.svc/?format=xml");
		System.out.println(urs.getFilename());
		System.out.println(urs.getDescription());

		SAXReader reader = new SAXReader();
		
//		Document doc = reader.read(urs.getFile());
		Document doc = reader.read(urs.getURL());
		
		Element el = doc.getRootElement();
		
		List list = el.elements();
		
		for(Iterator it = list.iterator(); it.hasNext();){
			Element book = (Element)it.next();
			List listBooks = book.elements();
			for(Iterator it2 = listBooks.iterator(); it2.hasNext();){
				Element et = (Element)it2.next();
				System.out.println(et.getText());
			}
		}
		
	}
}
