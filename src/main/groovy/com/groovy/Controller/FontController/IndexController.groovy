package com.groovy.Controller.FontController

import com.jfinal.core.ActionKey
import com.jfinal.core.Controller


/**
 * HelloController.groovy
 * 
 * @author: Hinsteny
 * @date: 2015年8月1日
 * @copyright: 2015 All rights reserved.
 * 
 */
class IndexController extends Controller {

	public void index() {
		renderText("Welcome to Jfinal Groovy!");
	}
	
	@ActionKey("/hello")
	public void hello() {
		renderText("hello Hinsteny Hisoka!");
	}
}
