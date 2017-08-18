package io.communet.springLearn.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pan on 2017/8/8.
 */
public class DemoMethodServiceTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        System.out.println("开始执行demoAnnotationService.add()");
        demoAnnotationService.add();
        System.out.println("开始执行demoMethodService.add()");
        demoMethodService.add();

        context.close();
    }
}
