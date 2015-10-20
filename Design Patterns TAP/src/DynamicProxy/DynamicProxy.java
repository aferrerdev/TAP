package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by alex on 20/10/15.
 */
public class DynamicProxy implements InvocationHandler
{
    private Object target = null;

    // Constructor Dynamic Proxy on li passem el objecte a invocar (target)
    private DynamicProxy(Object target)
    {
        this.target = target;
    }
    // Ens retornara una nova instancia de Proxy a partir del target creat
    public static Object newInstance(Object target)
    {
        Class targetClass = target.getClass();
        Class interfaces[] = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(targetClass.getClassLoader(),
                interfaces, new DynamicProxy(target));
    }
    // Aquest és el métode que invocara el mètode del objecte target vía Proxy
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        Object invocationResult = null;
        try
        {
            System.out.println("Before method " + method.getName());
            invocationResult = method.invoke(this.target, args);
            System.out.println("Result:"+invocationResult);
            System.out.println("After method " + method.getName());
        }
        catch(InvocationTargetException ite)
        {
            //this is the exception thrown by the method being invoked
            //we just rethrow the wrapped exception to conform to the interface
            throw ite.getTargetException();
        }
        catch(Exception e)
        {
            System.err.println("Invocation of " + method.getName() + " failed");
            System.err.println(e.getMessage());
        }
        finally
        {
            return invocationResult;
        }
    }
}
