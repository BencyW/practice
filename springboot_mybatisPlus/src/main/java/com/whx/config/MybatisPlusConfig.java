package com.whx.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author whx
 * @Date 2022/9/23 2:36 下午
 * @Version 1.0
 */
@Configuration
public class MybatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor getMybatisPlusInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(paginationInnerInterceptor);
        paginationInnerInterceptor.setDbType(DbType.MYSQL);
        return mybatisPlusInterceptor;
    }
}


// response.setHeader("Access-Control-Expose-Headers","Content-Disposition");
// fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
// response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName + ".xlsx", "UTF-8"));
// response.setHeader("Content-Length", String.valueOf(is.available()));
