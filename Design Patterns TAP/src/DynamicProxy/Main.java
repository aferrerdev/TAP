package DynamicProxy;

import java.lang.reflect.Proxy;

public class Main
{
    public static void main(String... args)
    {
        EmployeeDetails employe = new EmployeeDetails();
        // Proves del dynamic proxy.
        EmployeInterface t =  (EmployeInterface) DynamicProxy.newInstance(new EmpBusinessLogic());
        t.calculateAppraisal(employe);
    }
}