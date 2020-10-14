package org.zerock.boot10;

import lombok.extern.java.Log;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.zerock.boot10.interceptor.LoginCheckIntercepter;

@Log
@Configuration
public class IntercepterConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginCheckIntercepter()).addPathPatterns("/login");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
