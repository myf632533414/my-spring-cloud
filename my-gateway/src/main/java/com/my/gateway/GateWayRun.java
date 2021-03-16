package com.my.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <pre>
 * 其他说明：
 * </pre>
 * <p>作者：孟玉飞</p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2020/11/27 14:55</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayRun {

    public static void main(String[] args) {
        SpringApplication.run(GateWayRun.class,args);
    }
}
