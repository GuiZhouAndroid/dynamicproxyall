package com.bjpowernode;

/**
 *
 */
public class SubSuperStarLiu extends SuperStarLiu {
    //重写父类的方法,进行增强功能

    @Override
    public void sing() {
        //子类完成代理功能
        System.out.println("预订时间...........");
        //子类完成代理功能
        System.out.println("预订场地...........");

        //父类实现自己的业务功能
        super.sing();

        //子类完成代理功能
        System.out.println("结算费用...........");
    }
}
