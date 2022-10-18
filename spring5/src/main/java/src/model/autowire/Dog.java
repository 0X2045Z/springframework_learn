package src.model.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="dog") //这里的value类似于xml配置bean标签属性里的id
public class Dog {

    @Value("1")
    private int a;

    public void say() {
        System.out.println("Hello ... " + this.a);
    }
}

