package com.wml.test;

import com.wml.util.ChineseUtil;
import org.junit.Test;

/**
 * Decription:
 * Created by WangMinli on 2017/12/20.
 */
public class SomeTest {
    @Test
    public void someTest(){
        System.out.println(ChineseUtil.getFirstSpell("王民利")); //output: wml

    }

}
