package com.showfeer.floor.config;

import com.showfeer.floor.component.LoginHandlerInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class FirstConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                 .excludePathPatterns("/index.html","/","/user/login","/resources/*","/webjars/**");
    }



}
