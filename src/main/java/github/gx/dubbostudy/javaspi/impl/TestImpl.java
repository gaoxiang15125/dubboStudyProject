package github.gx.dubbostudy.javaspi.impl;

import github.gx.dubbostudy.javaspi.HelloInterface;

/**
 * @program: dubboStudyProject
 * @description: 两个对应的实现类，看起来 SPI 像是打包成不同 Jar 进行调用的机制
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-03-08 16:51
 **/
public class TestImpl implements HelloInterface {
    public void sayHello() {
        System.out.println("TestImpl is called.");
    }
}
