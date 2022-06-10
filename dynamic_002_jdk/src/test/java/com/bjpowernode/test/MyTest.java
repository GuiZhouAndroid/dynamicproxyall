package com.bjpowernode.test;

import com.bjpowernode.proxy.ProxyFactory;
import com.bjpowernode.service.Service;
import com.bjpowernode.service.impl.SuperStarLiu;
import com.bjpowernode.service.impl.SuperStarZhou;
import org.junit.Test;

/**
 *
 */
public class MyTest {

    @Test
    public void testJDK(){

        ProxyFactory factory = new ProxyFactory(new SuperStarZhou());
        Service agent = (Service) factory.getAgent();
        agent.sing();
    }
    @Test
    public void testJDK1(){

        ProxyFactory factory = new ProxyFactory(new SuperStarLiu());
        Service agent = (SuperStarLiu) factory.getAgent();
       // agent.one();

    }
    @Test
    public void testObject(){
        ProxyFactory factory = new ProxyFactory(new SuperStarLiu());
        Service agent = (Service) factory.getAgent();
        System.out.println(agent.getClass());
        //class com.sun.proxy.$Proxy2
        Service service = new SuperStarLiu();
        System.out.println(service.getClass());
    }
}
