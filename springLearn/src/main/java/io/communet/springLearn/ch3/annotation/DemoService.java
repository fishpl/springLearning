package io.communet.springLearn.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by pan on 2017/8/18.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}
