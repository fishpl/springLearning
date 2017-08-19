package io.communet.springMvcLearn.ch4.domain;

/**
 * Created by pan on 2017/8/19.
 */
public class DemoObj {
    private Long id;
    private String name;

    public DemoObj(){
        super();
    }

    public DemoObj(Long id,String name){
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
}
