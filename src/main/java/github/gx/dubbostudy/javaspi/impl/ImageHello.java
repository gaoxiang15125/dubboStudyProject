package github.gx.dubbostudy.javaspi.impl;

import github.gx.dubbostudy.javaspi.HelloInterface;

/**
 * @program: dubboStudyProject
 * @description: 通过 image 进行实现
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-03-08 16:52
 **/
public class ImageHello implements HelloInterface {
    public void sayHello() {
        System.out.println("Image interface say hello");
    }

    // TODO 对应的打包文件里有创建 类路径 的索引
    // 真的是之前写的 插件加载方式嘛 😂
}
