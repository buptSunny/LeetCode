package LeetCode.ProxyTest;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyAoP {
    public static void main(String[] args) {
        Eat pig = new Pig("白菜");
        InvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(pig);
        Eat proxyObj = (Eat) Proxy.newProxyInstance(pig.getClass().getClassLoader(),pig.getClass().getInterfaces(),proxyInvocationHandler);
        proxyObj.eat("dacong");
    }
}


interface Eat {
    public void eat(String s);
}

class Pig implements Eat {
    private  String s;
    Pig(String s){
        this.s = s;
    }
    @Override
    public void eat(String s) {
        System.out.println("Pig like eat" + s);
    }
}

class ProxyInvocationHandler implements InvocationHandler{
    private  Object obj;
    ProxyInvocationHandler(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理前");
        return method.invoke(obj,args);
    }
}
