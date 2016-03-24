package com.bit.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Wunderkinds on 23-03-2016.
 */
public class MathUtilTest {

    @Test
    public void addTest(){
        System.out.println("From addTest===>>>");
        Integer res = new MathUtil().add(10,10);
        Assert.assertEquals(res, new Integer(20));
    }
}
