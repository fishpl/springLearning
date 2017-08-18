package io.communet.springLearn.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pan on 2017/8/17.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次 " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "30 58 17 ? * *")//在指定的时间 17:58:30 执行
    public void fixTimeExcution(){
        System.out.println(String.format("在指定的时间 " + dateFormat.format(new Date())) + " 执行");
    }
}
