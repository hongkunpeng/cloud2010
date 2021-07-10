package com.atguigu.springcloud.entities.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: hkp
 * @create: 2020/09/06/23:13
 * @Description: what is it !
 * @Param:
 */
@Controller
public class IndexComtroller {
    @RequestMapping("index")
    public void indexDemo() {

        System.out.println("-----controller------");

    }
}
