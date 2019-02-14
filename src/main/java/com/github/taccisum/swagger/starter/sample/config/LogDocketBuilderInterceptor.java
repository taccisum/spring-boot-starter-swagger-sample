package com.github.taccisum.swagger.starter.sample.config;

import com.github.taccisum.swagger.configurer.DocketBuilderInterceptor;
import com.github.taccisum.swagger.configurer.event.AfterInitializeDocketEvent;
import com.github.taccisum.swagger.configurer.event.BeforeInitializeDocketEvent;
import org.springframework.stereotype.Component;

/**
 * @author tac - liaojf@cheegu.com
 * @since 2019/2/13
 */
@Component
public class LogDocketBuilderInterceptor implements DocketBuilderInterceptor {
    public void before(BeforeInitializeDocketEvent event) {
        System.out.println("before docket initialize");
    }

    public void after(AfterInitializeDocketEvent event) {
        System.out.println("after docket initialize");
    }

    public int getOrder() {
        return 0;
    }
}
