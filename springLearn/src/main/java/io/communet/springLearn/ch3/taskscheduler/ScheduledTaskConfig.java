package io.communet.springLearn.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by pan on 2017/8/17.
 */
@Configuration
@ComponentScan("io.communet.springLearn.ch3.taskscheduler")
@EnableScheduling
public class ScheduledTaskConfig {
}
