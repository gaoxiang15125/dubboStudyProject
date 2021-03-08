package github.gx.dubbostudy.javaspi;

import java.util.ServiceLoader;

/**
 * @program: dubboStudyProject
 * @description: 测试 SPI 机制实现是否正确
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-03-08 16:57
 **/
public class SPIMain {

    public  static void main(String[] args) {
        ServiceLoader<HelloInterface> loaders = ServiceLoader.load(HelloInterface.class);

        if(loaders != null) {
            for(HelloInterface helloInterface: loaders) {
                helloInterface.sayHello();
            }
        }
    }
}
