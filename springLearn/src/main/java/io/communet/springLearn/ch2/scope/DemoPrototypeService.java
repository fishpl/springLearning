package io.communet.springLearn.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by pan on 2017/8/9.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
