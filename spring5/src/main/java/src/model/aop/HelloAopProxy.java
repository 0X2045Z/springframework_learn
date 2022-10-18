package src.model.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * AspectJ操作AOP步骤：
 * 1.在Spring配置文件或配置类中开启注解扫描
 * 2.使用注解创建类和增强类
 * 3.在增强类上使用@Aspect申明这是个增强类
 * 4.在Spring配置文件或配置类中开启生成代理对象
 * 3.在增强方法上写切入点表达式，配置不同类型的通知
 * */
@Component
@Aspect
public class HelloAopProxy {

    /**
     * 前置增强
     * */
    @Before("execution(* src.model.aop.HelloAop.say(..) )")
    public void before() {

    }
}
