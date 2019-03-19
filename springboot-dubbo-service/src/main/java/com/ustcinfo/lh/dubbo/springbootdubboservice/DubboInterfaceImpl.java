package com.ustcinfo.lh.dubbo.springbootdubboservice;

import com.alibaba.dubbo.config.annotation.Service;
import com.ustcinfo.lh.dubbo.DubboInterface;

/**
 * @ClassName DubboInterfaceImpl
 * @Description
 * @Date 2019/2/26 16:09
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
@Service(version = "${demo.service.version}")
public class DubboInterfaceImpl implements DubboInterface {
    @Override
    public String sayHello() {
        return "hello world";
    }
}
