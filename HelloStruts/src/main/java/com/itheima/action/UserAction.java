package com.itheima.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ClassName:UserAction <br/>
 * Function: <br/>
 * Date: 2018年3月8日 上午10:56:13 <br/>
 */
public class UserAction extends ActionSupport {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String findById() {
        return SUCCESS;
    }

}
