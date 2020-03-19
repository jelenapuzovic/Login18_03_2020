package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class AllUsersLoginAction extends AbstractAction {

	
	@Override
	public String execute(HttpServletRequest request) {
		List<User> usersLog = (List<User>) request.getServletContext().getAttribute("usersLog");
		if(usersLog.isEmpty()) {
			request.setAttribute("errorMessage", "Users list is empty!");
		}
		return ViewConstants.ALL_LOGIN;
	}

}
