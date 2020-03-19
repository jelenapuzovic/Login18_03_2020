package action.impl;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;
import validator.Validator;
import validator.impl.UserValidator;

public class LoginAction extends AbstractAction {
	private static Validator validator = new UserValidator();

	@Override
	public String execute(HttpServletRequest request) {
		System.out.println("execute");
		String page = ViewConstants.LOGIN;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		List<User> users = (List<User>) request.getServletContext().getAttribute("users");
		List<User> usersLog = (List<User>) request.getServletContext().getAttribute("usersLog");
		try {
			User user = new User(username, password);
			validator.validateObject(user);
			if (users.contains(user)) {
				user=users.get(users.indexOf(user));
				if(usersLog.contains(user)) {
					page = ViewConstants.LOGIN;
					request.setAttribute("errorMessage", "User is already logged in!");
				}else {
					usersLog.add(user);
					page = ViewConstants.INDEX;
				}
				
			} else{
				page=ViewConstants.LOGIN;
				request.setAttribute("errorMessage", "User doesn't exist!");
			}
		} catch (Exception e) {
			System.out.println("exception");
			page=ViewConstants.LOGIN;
			request.setAttribute("validationError", e.getMessage());
			return page;

		}finally {
			request.getServletContext().setAttribute("users", users);
			request.getServletContext().setAttribute("usersLog", usersLog);
		}
		return page;

	}

}
