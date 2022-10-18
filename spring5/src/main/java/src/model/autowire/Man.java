package src.model.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "man")
public class Man {

    @Value("1")
    private int a;

    //根据类型注入
    @Autowired
    private Dog dog;

    //根据名称注入
    @Qualifier(value="dog")
    private Dog dog2;

    //根据类型注入
    @Resource
    private Dog dog3;

    //根据名称注入
    @Resource(name="dog")
    private Dog dog4;

    public void dogSay(){
        dog.say();
        System.out.println(this.a);
    }
}
