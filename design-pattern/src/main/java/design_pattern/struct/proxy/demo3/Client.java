package design_pattern.struct.proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by chensk on 2016/8/11.
 */
public class Client {
    /**
     * mc
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Subject subject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(subject);
        Subject proxySubject = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        System.out.println(proxySubject.getClass().getName());
        proxySubject.rent();
        proxySubject.hello("Kangkang");
    }
}
