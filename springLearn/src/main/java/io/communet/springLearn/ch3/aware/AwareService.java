package io.communet.springLearn.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by pan on 2017/8/14.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void outputResult() {
        System.out.println("Bean的名称是: " + beanName);

        Resource resource = loader.getResource("classpath:springLearn/ch3/aware/test.txt");

        try {
            System.out.println("ResourceLoader加载的文件内容为: " + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
