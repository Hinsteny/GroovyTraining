package com.groovy.Controller.Routes

import com.groovy.Controller.FontController.IndexController;
import com.groovy.Controller.FontController.UserController;
import com.jfinal.config.Routes


/**
 * FrontRoutes.groovy
 * 
 * @author: Hinsteny
 * @date: 2015年8月3日
 * @copyright: 2015 All rights reserved.
 * 
 */
class FrontRoutes extends Routes {

	@Override
	public void config() {
		me.add("/", IndexController.class);
		me.add("/user", UserController.class);
	}

}
