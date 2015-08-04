package com.groovy.Controller.FontController

import com.jfinal.core.ActionKey
import com.jfinal.core.Controller


/**
 * UserController.groovy
 * 
 * @author: Hinsteny
 * @date: 2015年8月1日
 * @copyright: 2015 All rights reserved.
 * 
 */
class UserController extends Controller {

	@ActionKey("/login")
	public void login() {
		renderText("Please do login to do more!");
	}
	
	@ActionKey("/register")
	public void register() {
		renderText("Please do login to do more!");
	}
	
	@ActionKey("/logout")
	public void logout() {
		renderText("logout bye!");
	}
}
