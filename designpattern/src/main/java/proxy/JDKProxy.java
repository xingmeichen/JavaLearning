package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.*;

/**
 * @author Mabel
 */
public class JDKProxy implements InvocationHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(JDKProxy.class);

    private Object targetObject;

    public JDKProxy() {}

    public JDKProxy(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object getTargetObject(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("在这里添加增强的前置代码");
        Object object = method.invoke(targetObject, args);
        System.out.println("[" + method.getName() + "]被调用了");
        System.out.println("在这里添加增强的后置代码");
        System.out.println("-------------------------这是一条分割线-------------------------");
        return object;
    }

    public static void main(String[] args) {
        JDKProxy JDKProxy = new JDKProxy();
        Person targetObject = (Person) JDKProxy.getTargetObject(new Student());
        targetObject.task();
        targetObject.task();
    }
}

