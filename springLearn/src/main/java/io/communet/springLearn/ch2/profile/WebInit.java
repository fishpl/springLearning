package io.communet.springLearn.ch2.profile;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by pan on 2017/8/11.
 */
public class WebInit implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) throws ServletException {
        container.setInitParameter("Spring.profile.default","dev");
    }

}
