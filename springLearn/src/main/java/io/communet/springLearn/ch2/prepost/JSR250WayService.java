package io.communet.springLearn.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by pan on 2017/8/11.
 */
public class JSR250WayService {
    @PostConstruct //在构造函数执行完毕之后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy //在Bean销毁之前执行
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }
}
