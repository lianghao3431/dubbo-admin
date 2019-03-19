package com.ustcinfo.lh.dubbo.springbootdubboclient;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ustcinfo.lh.dubbo.DubboInterface;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SpringbootDubboController
 * @Description
 * @Date 2019/2/26 16:13
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
@RestController
public class SpringbootDubboController {

    @Reference(version = "${demo.service.version}")
    private DubboInterface dubboInterface;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return dubboInterface.sayHello();
    }
}
