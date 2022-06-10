package com.bjpowernode.test;

import com.bjpowernode.SubSuperStarLiu;
import com.bjpowernode.SuperStarLiu;
import org.junit.Test;

/**
 *
 */
public class MyTest {

    @Test
    public void testAgent(){
        SuperStarLiu liu = new SubSuperStarLiu();
        liu.sing();
    }
}
