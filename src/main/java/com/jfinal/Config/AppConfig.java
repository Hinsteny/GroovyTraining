package com.jfinal.Config;

import com.groovy.Controller.Routes.AdminRoutes;
import com.groovy.Controller.Routes.FrontRoutes;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.render.ViewType;
/**
 * AppConfig.java
 * 
 * @author: Hinsteny
 * @date: 2015年8月1日
 * @copyright: 2015 All rights reserved.
 * 
 */
public class AppConfig extends JFinalConfig{

	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}
	
	public void configRoute(Routes me) {
		me.add(new FrontRoutes()); // 前端路由
		me.add(new AdminRoutes()); // 后端路由
	}
	
	public void configPlugin(Plugins me) {
		
	}
	
	public void configInterceptor(Interceptors me) {
		me.add(new AuthInterceptor());
	}
	
	public void configHandler(Handlers me) {
		
	}

}
