package io.communet.springLearn.ch3.conditional;

import org.springframework.stereotype.Service;

/**
 * Created by pan on 2017/8/18.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
