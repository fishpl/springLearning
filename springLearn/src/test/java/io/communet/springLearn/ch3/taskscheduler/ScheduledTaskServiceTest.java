package io.communet.springLearn.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pan on 2017/8/17.
 */
public class ScheduledTaskServiceTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledTaskConfig.class);

        ScheduledTaskService scheduledTaskService = context.getBean(ScheduledTaskService.class);
//        scheduledTaskService.fixTimeExcution();
//        scheduledTaskService.reportCurrentTime();
//
//        context.close();

    }
}
