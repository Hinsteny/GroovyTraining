package com.groovy.Controller.Routes

import com.jfinal.config.Routes;
import com.groovy.Controller.AdminController.AdminController;

/**
 * AdminRoutes.groovy
 * 
 * @author: Hinsteny
 * @date: 2015年8月3日
 * @copyright: 2015 All rights reserved.
 * 
 */
class AdminRoutes extends Routes{

	@Override
	public void config() {
		me.add("/admin", AdminController.class);
	}

}
