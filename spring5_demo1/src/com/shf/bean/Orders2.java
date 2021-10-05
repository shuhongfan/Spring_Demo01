package com.shf.bean;

public class Orders2 {
    private String oname;

    public Orders2() {
        System.out.println("第一步 执行无参数构造方法创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二部 调用set方法设置属性值");
    }

//    创建执行的初始化方法
    public void initMethod(){
        System.out.println("第三步 执行初始化方法");
    }

//    创建销毁方法
    public void destroy(){
        System.out.println("第五步 执行销毁方法");
    }
}
