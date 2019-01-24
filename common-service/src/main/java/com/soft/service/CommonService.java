package com.soft.service;
/**
 * Created by wangjian on 19/1/22.
 */

public class CommonService {

    private String name;

    private String id;

    public String service(){

        return String.format("My name is %s, id is %s",name,id);
    }

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
