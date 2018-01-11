package com.wml.test.concurrency.hasState;

/**
 * Decription:
 * Created by WangMinli on 2018/1/5.
 */
public class HasStateClassThreadB extends Thread{
    private HasStateClass hasStateClass;

    public HasStateClassThreadB(HasStateClass hasStateClass){
        super();
        this.hasStateClass = hasStateClass;
    }

    @Override
    public void run(){
        super.run();
        hasStateClass.addI("b");
    }
}
