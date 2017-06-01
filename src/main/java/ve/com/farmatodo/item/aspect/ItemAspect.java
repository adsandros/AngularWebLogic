package ve.com.farmatodo.item.aspect;

/**
 * Created by atoro on 30/05/2017.
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ItemAspect {
    private static final Logger logger = LoggerFactory.getLogger(ItemAspect.class);

    @Before("execution(* ve.com.farmatodo.item.base.Itemb.get*())")
    public void getBeforeAllItem(){
        logger.info("El servicio esta consultando el item");
        //System.out.println("Service method getter called");
    }

}
