package com.atguigu.springcloud.entities.web;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @author: hkp
 * @create: 2020/09/06/23:04
 * @Description: what is it !
 * @Param:
 */
public class MyWebApplicationInitializer   implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletCxt) {

        // Load Spring web application configuration
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(AppConfig.class);
        //ac.refresh();

        // Create and register the DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic registration = servletCxt.addServlet("myApp", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("*.do");
    }
}
