package com.ustcinfo.lh.dubbo;

/**
 * @ClassName TestMock
 * @Description
 * @Date 2019/2/26 14:23
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class TestMock implements IPersonInfoService{


    public PersonInfo getPersonInfo() {
        System.out.println("系统繁忙，请稍后。。。。");
        return new PersonInfo();
    }
}
