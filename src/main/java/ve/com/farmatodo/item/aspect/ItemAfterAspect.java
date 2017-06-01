package ve.com.farmatodo.item.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by atoro on 30/05/2017.
 */


public class ItemAfterAspect {
    private static final Logger logger = LoggerFactory.getLogger(ItemAfterAspect.class);

    @After("args(name)")
    public void logStringArguments(String name){
        logger.info("El servicio es llamado 3");
        System.out.println("Running After Advice. String argument passed="+name);
    }

    @AfterThrowing("within(ve.com.farmatodo.item.to.ItemTo)")
    public void logExceptions(JoinPoint joinPoint){
        logger.info("El servicio es llamado 4");
        System.out.println("Exception thrown in Employee Method="+joinPoint.toString());
    }

    @AfterReturning(pointcut="execution(* getName())", returning="returnString")
    public void getNameReturningAdvice(String returnString){
        logger.info("El servicio es llamado 5");
        System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
    }
}
