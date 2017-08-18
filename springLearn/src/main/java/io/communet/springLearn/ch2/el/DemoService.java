package io.communet.springLearn.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by pan on 2017/8/9.
 */
@Service
public class DemoService {
    @Value("其他的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void SetAnother(String another) {
        this.another = another;
    }
}
