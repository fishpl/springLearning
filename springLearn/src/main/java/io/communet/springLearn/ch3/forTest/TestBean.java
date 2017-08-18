package io.communet.springLearn.ch3.forTest;

/**
 * Created by pan on 2017/8/18.
 */
public class TestBean {
    private String content;

    public TestBean(String content){
        super();
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }
}
