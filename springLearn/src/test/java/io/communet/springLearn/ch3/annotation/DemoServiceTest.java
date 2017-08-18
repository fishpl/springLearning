package io.communet.springLearn.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pan on 2017/8/18.
 */
public class DemoServiceTest {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();

        context.close();
    }
}
