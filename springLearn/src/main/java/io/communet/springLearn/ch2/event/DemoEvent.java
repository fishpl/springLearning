package io.communet.springLearn.ch2.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * Created by pan on 2017/8/14.
 */
public class DemoEvent extends ApplicationEvent implements Serializable{
    private static final long serialVersionUID = 7559502820436001689L;
    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
