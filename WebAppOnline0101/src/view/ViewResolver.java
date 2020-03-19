package view;

import java.util.HashMap;
import java.util.Map;

import javax.activation.MailcapCommandMap;

import org.omg.CORBA.PRIVATE_MEMBER;

import constants.PageConstants;
import constants.ViewConstants;

public class ViewResolver {
	private Map<String, String> pages;

	public ViewResolver() {
		pages=new HashMap<String,String>(){
			{
			put(ViewConstants.ADD_USER,PageConstants.PAGE_ADD_USER);
			put(ViewConstants.INDEX,PageConstants.PAGE_INDEX);
			put(ViewConstants.LOGIN,PageConstants.PAGE_LOGIN);
			put(ViewConstants.ALL_USER,PageConstants.PAGE_ALL_USER);
			put(ViewConstants.ALL_LOGIN,PageConstants.PAGE_LOGGED_USER);
			put(ViewConstants.DEFAULT_ERROR,PageConstants.PAGE_DEFAULT_ERROR);

			}
		};
	}
	
	
	public String getPage(String view) {
		if(pages.containsKey(view)) return pages.get(view);
		return null;
	}

}
