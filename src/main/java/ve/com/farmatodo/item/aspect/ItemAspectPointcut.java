package ve.com.farmatodo.item.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by atoro on 30/05/2017.
 */

public class ItemAspectPointcut {
    private static final Logger logger = LoggerFactory.getLogger(ItemAspect.class);

    @Before("getNamePointcut()")
    public void loggingAdvice(){
        logger.info("El servicio es llamado 6");
        System.out.println("Executing loggingAdvice on getName()");
    }

    @Before("getNamePointcut()")
    public void secondAdvice(){
        logger.info("El servicio es llamado 7");
        System.out.println("Executing secondAdvice on getName()");
    }

    @Pointcut("execution(public String getName())")
    public void getNamePointcut(){}

    @Before("allMethodsPointcut()")
    public void allServiceMethodsAdvice(){
        logger.info("El servicio es llamado 8");
        System.out.println("Before executing service method");
    }

    //Pointcut to execute on all the methods of classes in a package
    @Pointcut("within(ve.com.farmatodo.item.base.*)")
    public void allMethodsPointcut(){}
}
