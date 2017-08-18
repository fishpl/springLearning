package io.communet.springLearn.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by pan on 2017/8/14.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务: " + i);
    }

    @Async
    public void executeAsyncTaskPuls(Integer i){
        System.out.println("执行异步任务 +1: " + i );
    }
}
