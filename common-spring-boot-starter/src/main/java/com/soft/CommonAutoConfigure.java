package com.soft;/**
 * Created by wangjian on 19/1/22.
 */

import com.soft.service.CommonService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */

@Configuration
@EnableConfigurationProperties(CommonProperties.class)
public class CommonAutoConfigure {

    @Bean
    public CommonService getCommonService(CommonProperties cp){
        CommonService commonService =  new CommonService();
        commonService.setName(cp.getName());
        commonService.setId(cp.getId());
        return commonService;
    }

}
