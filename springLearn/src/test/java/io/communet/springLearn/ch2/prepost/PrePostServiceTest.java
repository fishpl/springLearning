package io.communet.springLearn.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pan on 2017/8/11.
 */
public class PrePostServiceTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        context.close();
    }
}
