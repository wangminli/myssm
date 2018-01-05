package com.wml.test.highConcurrency;

/**
 * Decription:
 * Created by WangMinli on 2018/1/5.
 */
public class HasStateClassThreadA extends Thread{
    private HasStateClass hasStateClass;

    public HasStateClassThreadA(HasStateClass hasStateClass){
        super();
        this.hasStateClass = hasStateClass;
    }

    @Override
    public void run(){
        super.run();
        hasStateClass.addI("a");
    }
}
