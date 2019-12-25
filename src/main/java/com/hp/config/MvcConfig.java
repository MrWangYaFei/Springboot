package com.hp.config;

import com.hp.loginInterceptor.LoginInter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class MvcConfig implements WebMvcConfigurer {
    @Bean
    public LoginInter GetLoginInterCaptor(){
        //产生对象
        return  new LoginInter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(GetLoginInterCaptor()).addPathPatterns("/**");
    }
}
