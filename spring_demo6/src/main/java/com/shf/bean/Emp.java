package com.shf.bean;

//员工类
public class Emp {
    private String ename;
    private String gender;
//    员工属于摸一个部门
    private Dept dept;

    public void setDept(Dept dept){
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }

    public void test2(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
