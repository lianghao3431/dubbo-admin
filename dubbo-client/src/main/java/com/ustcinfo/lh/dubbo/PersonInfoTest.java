package com.ustcinfo.lh.dubbo;

import javax.annotation.Resource;

/**
 * @ClassName PersonInfoTest
 * @Description
 * @Date 2019/2/26 14:20
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class PersonInfoTest {

    @Resource(name="personInfoService")
    private IPersonInfoService personInfoService;


    public void getPsersonInfo(){

        System.out.println(personInfoService.getPersonInfo());
    }
}
