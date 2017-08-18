package io.communet.springLearn.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pan on 2017/8/14.
 */
public class AsyncTaskServiceTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for (int i = 0; i < 15; i++) {//i为1到15
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPuls(i);
        }
        context.close();
    }
}
