package com.github.taccisum.swagger.starter.sample.config;

import com.github.taccisum.swagger.configurer.DocketBuilderInterceptor;
import com.github.taccisum.swagger.configurer.event.AfterInitializeDocketEvent;
import com.github.taccisum.swagger.configurer.event.BeforeInitializeDocketEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tac - liaojf@cheegu.com
 * @since 2019/2/12
 */
@Configuration
public class AppConfig {
//    @Bean
//    public DocketBuilderInterceptor interceptor() {
//        return new DocketBuilderInterceptor() {
//            public void before(BeforeInitializeDocketEvent beforeInitializeDocketEvent) {
//                System.out.println("hhh");
//            }
//
//            public void after(AfterInitializeDocketEvent afterInitializeDocketEvent) {
//                System.out.println("after");
//            }
//
//            public int getOrder() {
//                return 0;
//            }
//        };
//    }
//
//    @Bean
//    public DocketBuilderInterceptor interceptor1() {
//        return new DocketBuilderInterceptor() {
//            public void before(BeforeInitializeDocketEvent beforeInitializeDocketEvent) {
//                System.out.println("hhh1");
//            }
//
//            public void after(AfterInitializeDocketEvent afterInitializeDocketEvent) {
//                System.out.println("after1");
//            }
//
//            public int getOrder() {
//                return 1;
//            }
//        };
//    }
}
