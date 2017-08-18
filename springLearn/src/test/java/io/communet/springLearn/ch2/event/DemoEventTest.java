package io.communet.springLearn.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pan on 2017/8/14.
 */
public class DemoEventTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("Hello application event !! ");

        demoPublisher.publish("application event 2222  !! ");
        demoPublisher.publish("application event 3333  !! ");

        context.close();
    }
}
