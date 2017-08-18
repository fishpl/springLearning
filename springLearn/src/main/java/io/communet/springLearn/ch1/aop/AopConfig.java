package io.communet.springLearn.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by pan on 2017/8/8.
 */
@Configuration
@ComponentScan("io.communet.springLearn.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
