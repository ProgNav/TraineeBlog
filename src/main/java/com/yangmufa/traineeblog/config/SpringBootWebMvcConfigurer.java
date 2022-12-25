package com.yangmufa.traineeblog.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class SpringBootWebMvcConfigurer implements WebMvcConfigurer {
    // 自定义静态资源映射目录
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/files/**").addResourceLocations("file:tempUploadFile\\");
    }
}
