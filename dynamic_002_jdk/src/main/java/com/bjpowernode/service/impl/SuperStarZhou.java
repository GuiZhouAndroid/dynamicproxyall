package com.bjpowernode.service.impl;

import com.bjpowernode.service.Service;

/**
 *  目标对象:周润发
 */
public class SuperStarZhou implements Service {
    @Override
    public void sing() {
        System.out.println("我是周润发,我正在表演唱歌........");
    }
    @Override
    public String show(int age) {
        System.out.println("周润发的show........."+age);
        return "zhou";
    }
}
