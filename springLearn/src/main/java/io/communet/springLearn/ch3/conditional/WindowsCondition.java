package io.communet.springLearn.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * Created by pan on 2017/8/18.
 */
public class WindowsCondition implements Condition {

    public boolean matches(ConditionContext context,AnnotatedTypeMetadata metadata){
        return context.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
