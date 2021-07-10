package com.atguigu.springcloud.entities.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author: hkp
 * @create: 2020/09/06/23:10
 * @Description: what is it !
 * @Param:
 */
@Configuration
@ComponentScan("com.atguigu.springcloud.entities.web")
public class AppConfig  implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

    }
}
