package io.communet.springLearn.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pan on 2017/8/9.
 */
public class DemoScopeServiceTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletomService demoSingletomService1 = context.getBean(DemoSingletomService.class);
        DemoSingletomService demoSingletomService2 = context.getBean(DemoSingletomService.class);

        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("demoSingletomService1 与 demoSingletomService2 是否相同 " + demoSingletomService1.equals(demoSingletomService2));
        System.out.println("demoPrototypeService1 与 demoPrototypeService2 是否相同 " + demoPrototypeService1.equals(demoPrototypeService2));

        context.close();
    }
}
