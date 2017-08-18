package io.communet.springLearn.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by pan on 2017/8/14.
 */
@Component
public class DemoListenter implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();

        System.out.println("我(bean-demoListenter)接收到了bean-demoPublisher发布的消息 >>> "+msg);
    }
}
