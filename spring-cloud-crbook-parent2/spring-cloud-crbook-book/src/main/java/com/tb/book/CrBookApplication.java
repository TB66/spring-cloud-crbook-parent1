package com.tb.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableEurekaClient
// 服务降级注解
@EnableCircuitBreaker
@SpringBootApplication
@MapperScan("com.tb.crbook.dao")
public class CrBookApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(CrBookApplication.class, args);
    }

    /**
     * 	定义 RestTemplate  Bean
     */
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}