package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;

public class BackAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return ViewConstants.INDEX;
	}

}
