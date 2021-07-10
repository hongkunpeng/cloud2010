package com.atguigu.springcloud.entities.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: hkp
 * @create: 2020/09/06/21:33
 * @Description: what is it !
 * @Param:
 */

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           log("------servlet-------");
    }



}
