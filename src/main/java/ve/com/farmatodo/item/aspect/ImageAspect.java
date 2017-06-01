package ve.com.farmatodo.item.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by atoro on 31/05/2017.
 */

@Aspect
@Component
public class ImageAspect {
    private static final Logger logger = LoggerFactory.getLogger(ImageAspect.class);

    @Before("execution(* ve.com.farmatodo.item.base.Imageb.get*())")
    public void getBeforeAllImage(){
        logger.error("El servicio esta consultando la imagen");
        //System.out.println("Service method getter called");
    }
}
