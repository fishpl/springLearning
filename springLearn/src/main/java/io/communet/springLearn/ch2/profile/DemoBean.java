package io.communet.springLearn.ch2.profile;

/**
 * Created by pan on 2017/8/14.
 */
public class DemoBean {
    private String content;

    public DemoBean(String content){
        super();
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }
}
