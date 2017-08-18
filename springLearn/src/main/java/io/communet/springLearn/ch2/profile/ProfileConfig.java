package io.communet.springLearn.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by pan on 2017/8/14.
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("from development peofile");
    }

    @Bean
    @Profile("prod")
    public DemoBean proDemoBean() {
        return new DemoBean("from production profile");
    }

}
