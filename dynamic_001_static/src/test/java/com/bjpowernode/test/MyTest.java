package com.bjpowernode.test;

import com.bjpowernode.service.Service;
import com.bjpowernode.service.impl.Agent;
import com.bjpowernode.service.impl.SuperStarLiu;
import com.bjpowernode.service.impl.SuperStarZhou;
import org.junit.Test;

/**
 *
 */
public class MyTest {
    @Test
    public void testAgent(){
       //测试功能
//        SuperStarLiu liu = new SuperStarLiu();
//        liu.sing();

//        Agent agent = new Agent();
//        agent.sing();

        //有接口和实现类,必须使用接口指向实现类(规范)
//        Service agent = new Agent();
//        agent.sing();
    }

    @Test
    public void testAgent1(){
        Service agent = new Agent(new SuperStarZhou());
        agent.sing();
    }

    @Test
    public void testA(){
        Service service = new Service() {
            @Override
            public void sing() {
                System.out.println("哈哈哈哈.........");
            }
        };
        service.sing();
    }

}
