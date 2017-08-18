package io.communet.springLearn.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pan on 2017/8/9.
 */
public class DemoElServiceTest {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();

        context.close();
    }
}
