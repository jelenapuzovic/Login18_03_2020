package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class AllAction extends AbstractAction{

	
	@Override
	public String execute(HttpServletRequest request) {
		List<User> users = (List<User>) request.getServletContext().getAttribute("users");
		if(users.isEmpty()) {
			request.setAttribute("errorMessage", "Users list is empty!");
		}
		return ViewConstants.ALL_USER;
	}

}
