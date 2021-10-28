package com.shf;

import com.shf.aop.UserDao;
import com.shf.aop.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//连接点   类里面哪些方法可以被增强,这些方法成为连接点
//切入点  实际被增强的方法 成为切入点
//通知/增强 实际增强的逻辑部分成为通知
//    通知有多种类型  前置通知/后置通知/环绕通知/异常通知/最终通知
//切面  把通知应用到切入点的过程
public class JDKProxy {
    public static void main(String[] args) {
//        创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println("resutl:"+result);
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler{

//    创建的是谁的代理对象 把谁传递过来
//    有参构造传递
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

//    增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        方法之前
        System.out.println("方法之前执行..."+method.getName()+":传递的参数...."+ Arrays.toString(args));
//        被增强的方法执行
        Object res = method.invoke(obj, args);
//        方法之后
        System.out.println("方法之后执行..."+obj);
        return res;
    }
}
