package com.bjpowernode.service.impl;

import com.bjpowernode.service.Service;

/**
 *  目标对象:刘德华
 */
public class SuperStarLiu  implements Service {
    @Override
    public void sing() {
        System.out.println("我是刘德华,我正在表演唱歌........");
    }

    @Override
    public String show(int age) {
        System.out.println("刘德华的show........."+age);
        return "liu";
    }

    //此方法不能被代理(不以增强功能)
    public void one(){
        System.out.println("one............");
    }
}
