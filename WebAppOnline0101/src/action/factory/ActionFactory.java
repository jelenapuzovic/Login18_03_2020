package action.factory;

import action.AbstractAction;
import action.impl.AddAction;
import action.impl.AllAction;
import action.impl.AllUsersLoginAction;
import action.impl.BackAction;
import action.impl.GoToLoginAction;
import action.impl.LoginAction;
import action.impl.NewUserAction;

public class ActionFactory {
	public static AbstractAction createActionFactory(String actionName) {
		AbstractAction action =null;
		if(actionName.equalsIgnoreCase("/login")) {
			action = new GoToLoginAction();
			
		}
		if(actionName.equalsIgnoreCase("/users/login")) {
			action = new LoginAction();
			
		}
		if(actionName.equalsIgnoreCase("/users/all")) {
			action = new AllAction();
			
		}
		if(actionName.equalsIgnoreCase("/users/back")) {
			action = new BackAction();
			
		}
		if(actionName.equalsIgnoreCase("/users/add")) {
			action = new AddAction();
			
		}
		if(actionName.equalsIgnoreCase("/users/new")) {
			action = new NewUserAction();
			
		}
		if(actionName.equalsIgnoreCase("/users/logged")) {
			action = new AllUsersLoginAction();
			
		}
		return action;
	}

}
