package com.ustcinfo.lh.dubbo;

import java.io.Serializable;

/**
 * @ClassName PersonInfo
 * @Description
 * @Date 2019/2/26 14:02
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class PersonInfo implements Serializable {

    private String name;

    private String password;
    public PersonInfo(){

    }
    public PersonInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
