package com.whx.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

/**
 * @Author whx
 * @Date 2022/9/21 11:22 上午
 * @Version 1.0
 */
@Configuration//放入IOC容器当中
public class ApplicationContextUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    //将创建好的工厂以参数的形式传递给这个类
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    //提供在工厂获取对象的方法
    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }
}


