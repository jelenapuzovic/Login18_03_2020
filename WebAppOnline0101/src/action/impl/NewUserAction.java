package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;
import validator.Validator;
import validator.impl.UserValidator;

public class NewUserAction extends AbstractAction{

private static Validator validator = new UserValidator();
	
	@Override
	public String execute(HttpServletRequest request) {
		System.out.println("execute");
		String page = ViewConstants.INDEX;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		List<User> users = (List<User>) request.getServletContext().getAttribute("users");
		try {
			User user = new User(name,surname,username, password);
			validator.validateObject(user);
			if (users.contains(user)) {
				page=ViewConstants.ADD_USER;
				request.setAttribute("errorMessage", "User already exists!");
			} else{
				users.add(user);
				request.getServletContext().setAttribute("users", users);
				
			}
		} catch (Exception e) {
			System.out.println("exception");
			page=ViewConstants.ADD_USER;
			request.setAttribute("validationError", e.getMessage());
			return page;

		}
		return page;
	}
	
}
