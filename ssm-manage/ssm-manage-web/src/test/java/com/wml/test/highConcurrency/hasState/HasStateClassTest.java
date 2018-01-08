package com.wml.test.highConcurrency.hasState;

/**
 * Decription:
 * Created by WangMinli on 2018/1/5.
 */
public class HasStateClassTest {
    public static void main(String[] args) {
        HasStateClass hasStateClass = new HasStateClass();
        HasStateClassThreadA threadA = new HasStateClassThreadA(hasStateClass);
        threadA.start();
        HasStateClassThreadB threadB = new HasStateClassThreadB(hasStateClass);
        threadB.start();
    }

    /**
     *  某次运行结果
     b的分值设置成功
     username : b, num : 100
     a的分值设置成功
     username : a, num : 100
     */

    /**
     * 多个实例会产生多个锁，即对象锁
     * @param args
     */
    public static void main1(String[] args) {
        HasStateClassThreadA threadA = new HasStateClassThreadA(new HasStateClass());
        threadA.start();
        HasStateClassThreadB threadB = new HasStateClassThreadB(new HasStateClass());
        threadB.start();
    }
}
