package com.ustcinfo.lh.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MainClientRunner
 * @Description
 * @Date 2019/2/26 14:12
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class MainClientRunner {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
        context.start();
        PersonInfoTest personInfoTest = (PersonInfoTest) context.getBean("personInfoTest");
       // DemoServiceTest demoServiceTest = (DemoServiceTest) context.getBean("demoServiceTest");
        for (int i = 0 ; i<5;i++){
            personInfoTest.getPsersonInfo();
          //  demoServiceTest.sayHello();
        }
        try {
            Thread.sleep(3600 * 24);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * 关闭spring的容器
         */
        context.close();
    }
}
