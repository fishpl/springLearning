package io.communet.springLearn.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by pan on 2017/8/8.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("执行了 DemoMethodService 的 add 方法");
    }
}
