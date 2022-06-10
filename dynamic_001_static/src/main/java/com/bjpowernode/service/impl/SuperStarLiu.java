package com.bjpowernode.service.impl;

import com.bjpowernode.service.Service;

/**
 *   目标对象:刘德华,实现业务接口中的功能,进行唱歌表演
 */
public class SuperStarLiu implements Service {
    @Override
    public void sing() {
        System.out.println("我是刘德华,我正在表演唱歌............");
    }
}
