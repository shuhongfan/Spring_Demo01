package com.shf.bean;

public class Orders {
    private String oname;

    public void setOname(String oname) {
        System.out.println("第二步 调用set方法设置属性值");
        this.oname = oname;
    }

    public Orders() {
        System.out.println("第一部 执行无参构造创建bean实例");
    }

    public void initMethod(){
        System.out.println("第三步 执行初始化方法");
    }

    public void destroyMethod() {
        System.out.println("第五步 执行销毁方法");
    }
}
