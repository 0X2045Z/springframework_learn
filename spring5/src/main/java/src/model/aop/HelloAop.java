package src.model.aop;

import org.springframework.stereotype.Component;

@Component
public class HelloAop {

    public void say() {
        System.out.println("我是要增强的方法");
    }
}
