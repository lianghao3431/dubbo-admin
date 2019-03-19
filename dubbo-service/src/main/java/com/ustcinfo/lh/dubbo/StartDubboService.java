package com.ustcinfo.lh.dubbo;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName StartDubboService
 * @Description
 * @Date 2019/2/26 14:07
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class StartDubboService {

    public static void main(String[] args) throws IOException {
        Main.main(new String[]{"spring" , "log4j"});
/*        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
        context.start();
        System.in.read();*/
    }
}
