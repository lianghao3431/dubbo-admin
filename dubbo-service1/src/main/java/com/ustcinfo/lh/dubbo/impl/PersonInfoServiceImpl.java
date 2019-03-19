package com.ustcinfo.lh.dubbo.impl;

import com.ustcinfo.lh.dubbo.IPersonInfoService;
import com.ustcinfo.lh.dubbo.PersonInfo;

/**
 * @ClassName PersonInfoServiceImpl
 * @Description
 * @Date 2019/2/26 14:07
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class PersonInfoServiceImpl implements IPersonInfoService {
    public PersonInfo getPersonInfo() {
        System.out.println("=======被调用了========");
        return new PersonInfo("lianghao","lianghao");
    }
}
