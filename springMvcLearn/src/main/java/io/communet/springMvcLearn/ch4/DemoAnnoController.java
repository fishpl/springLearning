package io.communet.springMvcLearn.ch4;

import io.communet.springMvcLearn.ch4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pan on 2017/8/19.
 */
@Controller//1 声明这是一个控制器
@RequestMapping("/anno")//2 映射此类的访问路径是/anno
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")//3 没有标注路径,所以访问路径是/anno
    public @ResponseBody String index(HttpServletRequest request){//4 接受HttpServletRequest作为参数
        return "url: " + request.getRequestURL() + " can access";
    }

    @RequestMapping(value = "/pathvar/{str}" , produces = "text/plain;charset=UTF-8")//5 访问路径为/anno/pathvar/xxx,可以通过str获取xxx
    public @ResponseBody String demoPathVar(@PathVariable String str,HttpServletRequest request){
        return "url: " + request.getRequestURL() + " can access,str: "+ str;
    }

    @RequestMapping(value = "/requestParam" ,produces = "text/plain;charset=UTF-8")//6 常规的参数获取,路径为/anno/requestParam?id=123
    public @ResponseBody String passRequestParam(Long id,HttpServletRequest request){
        return "url: " + request.getRequestURL() + " can access,id: " + id;
    }

    @RequestMapping(value = "/obj",produces = "application/json;charset=UTF-8")//7 解释参数到对象,访问路径为/anno/obj/id=123&name=xxx
    @ResponseBody//8 @ResponseBody也可以放在方法上,也可以放到注解中
    public String passObj(DemoObj obj,HttpServletRequest request){
        return "url: " + request.getRequestURL() + " can access,obj id: " + obj.getId() +" , obj name: " + obj.getName();
    }

    @RequestMapping(value = {"/name1","/name2"},produces = "text/plain;charset=UTF-8")//9 映射到不同的路径得到相同的方法,访问路径为:/anno/name1或者/anno/name2
    public @ResponseBody String remove(HttpServletRequest request){
        return "url: " + request.getRequestURL() + " can access";
    }
}
