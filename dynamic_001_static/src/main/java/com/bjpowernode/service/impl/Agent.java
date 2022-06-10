package com.bjpowernode.service.impl;

import com.bjpowernode.service.Service;

import java.lang.reflect.Proxy;

/**
 *  助理:代理对象,完成除了唱歌主业务之外的其它业务:时间,场地预订,结算费用
 */
public class Agent implements Service {

    //类中的成员变量设计为接口
    public Service target;  //目标对象

    //传入目标对象,方法的参数设计为接口
    public Agent(Service target){
        this.target = target;

    }

    @Override
    public void sing() {
        System.out.println("预订时间..........");
        System.out.println("预订场地..........");

        //切记切记:业务功能必须由目标对象亲自实现
//        SuperStarLiu liu = new SuperStarLiu();
//        liu.sing();
//
//        SuperStarZhou zhou = new SuperStarZhou();
//        zhou.sing();

        //面向接口编程:调用时,接口指向实现类
        target.sing();

        System.out.println("结算费用..........");
    }
}

