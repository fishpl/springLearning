package io.communet.springMvcLearn.ch4;

import io.communet.springMvcLearn.ch4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pan on 2017/8/19.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {
    @RequestMapping(value = "/getjson",produces = "application/json;charset=UTF-8")
    public DemoObj getjson(DemoObj obj){
        return new DemoObj(obj.getId(),obj.getName() + "yy");
    }

    @RequestMapping(value = "getxml",produces = "application/xml;cahrset=UTF-8")
    public DemoObj getxml(DemoObj obj){
        return new DemoObj(obj.getId(),obj.getName()+"yy");
    }
}
