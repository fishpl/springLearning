package io.communet.springLearn.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pan on 2017/8/18.
 */
public class ListServiceTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name")
                + "系统下的列表命令为"
                + listService.showListCmd());

    }
    //本例运行失败,错误信息如下:

//    Connected to the target VM, address: '127.0.0.1:50366', transport: 'socket'
//    八月 18, 2017 2:32:45 下午 org.springframework.context.annotation.AnnotationConfigApplicationContext prepareRefresh
//    信息: Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@35f983a6: startup date [Fri Aug 18 14:32:45 CST 2017]; root of context hierarchy
//    Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'io.communet.springLearn.ch3.conditional.ListService' available
//    at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:353)
//    at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:340)
//    at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1093)
//    at io.communet.springLearn.ch3.conditional.ListServiceTest.main(ListServiceTest.java:13)
//    Disconnected from the target VM, address: '127.0.0.1:50366', transport: 'socket'
//
//    Process finished with exit code 1
}
