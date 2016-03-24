package com.bit.util;

/**
 * Created by Wunderkinds on 23-03-2016.
 */

public class MathUtil {

    public Integer add(Integer a, Integer b){
        return a+b;
    }

    public static void main(String [] args){
        Integer res = new MathUtil().add(15,15);
        System.out.print("Result: "+res);
    }

}
