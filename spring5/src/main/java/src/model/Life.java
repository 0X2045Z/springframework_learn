package src.model;

public class Life {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("第二步：Set注入属性或外部Bean");
        this.name = name;
    }

    public Life() {
        System.out.println("第一步：构造器创建Bean");
    }

    public void init(){
        System.out.println("第三步：执行初始化方法");
    }

    public void destroy(){
        System.out.println("第五步：执行销毁方法");
    }
}
