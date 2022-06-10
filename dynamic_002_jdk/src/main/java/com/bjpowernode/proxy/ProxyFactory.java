package com.bjpowernode.proxy;

import com.bjpowernode.service.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
public class ProxyFactory {
    //类中的成员变量设计为接口,目标对象
    Service target;

    //传入目标对象
    public ProxyFactory(Service target){
        this.target = target;
    }

    //返回动态代理对象
    public Object getAgent(){
        return Proxy.newProxyInstance(
                //ClassLoader loader, 类加载器,完成目标对象的加载
                target.getClass().getClassLoader(),
                //Class<?>[] interfaces,目标对象实现的所有接口
                target.getClass().getInterfaces(),
                //InvocationHandler h,实现代理功能的接口 ,我们传入的是匿名内部实现
                new InvocationHandler() {
                    @Override
                    public Object invoke(
                            //创建代理对象
                            Object proxy,
                            //method就是目标方法sing(),show()
                            Method method,
                            //目标方法的参数
                            Object[] args) throws Throwable {
                        //代理功能
                        System.out.println("预订时间........");
                        //代理功能
                        System.out.println("预订场地........");
                        //主业务功能实现
                        //target.sing();还是写死了方法的调用, 不成
                        //sing(),show(),one()
                        Object obj = method.invoke(target,args);
                        //代理功能
                        System.out.println("结算费用........");
                        return obj;  //切记:这个是目标方法的返回值
                    }
                }
        );
    }
}
