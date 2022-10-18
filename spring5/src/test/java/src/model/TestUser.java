package src.model;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import src.model.autowire.Dog;
import src.model.config.SpringConfig;

public class TestUser {

    @Test
    public void testAdd() {
        // 1.加载spring配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean01.xml");
        // 2.获取配置文件创建的对象
        User user = applicationContext.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testLife() {
        // 1.加载spring配置文件
//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("bean01.xml");
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean01.xml");
        // 2.获取配置文件创建的对象
        Life life = applicationContext.getBean("life", Life.class);
        System.out.println("第四步：使用Bean对象 ... " + life.getName());
        // 3.关闭容器
        applicationContext.close();
    }

    @Test
    public void tetDogSay() {
        // 1.加载spring配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application.xml");
        // 2.获取配置文件创建的对象
        Dog dog = applicationContext.getBean("dog", Dog.class);

        dog.say();
    }

    @Test
    public void testConfig() {
        // 1.加载spring配置类
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        // 2.获取配置文件创建的对象
        Dog dog = applicationContext.getBean("dog", Dog.class);

        dog.say();

    }
}
