package github.gx.dubbostudy.javaspi;

/**
 * @program: dubboStudyProject
 * @description: 需要使用 SPI 机制进行实现的接口
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-03-08 16:47
 **/
public interface HelloInterface {

    /**
     * 创建目标方法，期望实现插件形式的调用
     */
    void sayHello();
}
