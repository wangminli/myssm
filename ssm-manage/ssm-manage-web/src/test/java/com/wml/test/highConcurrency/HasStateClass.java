package com.wml.test.highConcurrency;

/** 测试有状态的类的非线程安全
 * Decription: 有状态的类，即有属性（静态变量）的类
 * Created by WangMinli on 2018/1/5.
 */
public class HasStateClass {
    // 有实例变量
    private int num = 0;

    /**
     * 根据不同名字设置不同分值
     * 注意：没加synchronized标记
     * @param username
     */
    synchronized public void addI(String username){
        //int num = 0;  //将num设置在方法内部，就变得线程安全了！
        try {
            if(username.equals("a")){
                num = 100;
                System.out.println("a的分值设置成功");
            }else{
                num = 200;
                System.out.println("b的分值设置成功");
            }
            System.out.println("username : " + username + ", num : " + num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
