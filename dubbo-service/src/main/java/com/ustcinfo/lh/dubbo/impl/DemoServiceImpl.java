package com.ustcinfo.lh.dubbo.impl;

import com.ustcinfo.lh.dubbo.IDemoService;

/**
 * @ClassName DemoServiceImpl
 * @Description
 * @Date 2019/2/27 9:27
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class DemoServiceImpl implements IDemoService {
    public void sayHello(String msg) {
        System.out.println("hello:"+msg);
    }
}
