package io.communet.springLearn.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by pan on 2017/8/8.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + " !";
    }
}
