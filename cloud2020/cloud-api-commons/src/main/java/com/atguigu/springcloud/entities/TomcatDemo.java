package com.atguigu.springcloud.entities;

import org.apache.catalina.startup.Tomcat;

/**
 * @author: hkp
 * @create: 2020/09/06/21:28
 * @Description: what is it !
 * @Param:
 */
public class TomcatDemo {
    public static void main(String[] args) throws  Exception {
        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8888);

        tomcat.addWebapp("/boot","E:\\");
        tomcat.start();

//        MyServlet myServlet=new MyServlet();
//
//        Context context=tomcat.addWebapp("/boot","E:\\");
//        tomcat.addServlet("/boot","index",myServlet);
//        context.addServletMappingDecoded("/index.do","index");

        tomcat.getServer().await();

    }
}
