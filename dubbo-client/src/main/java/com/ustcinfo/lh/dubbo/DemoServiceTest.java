package com.ustcinfo.lh.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName DemoServiceTest
 * @Description
 * @Date 2019/2/27 9:51
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */

@Service
public class DemoServiceTest {

    @Autowired
    private IDemoService demoService;
    public void sayHello() {
        demoService.sayHello("lianghao");
    }

}
