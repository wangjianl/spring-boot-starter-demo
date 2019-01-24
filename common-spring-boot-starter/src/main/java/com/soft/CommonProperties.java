package com.soft;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by wangjian on 19/1/22.
 */

@ConfigurationProperties(prefix ="common.properties" )
public class CommonProperties {

    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
