package io.communet.springLearn.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by pan on 2017/8/8.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("执行了 DemoAnnotationService 的 add 方法");
    }
}
